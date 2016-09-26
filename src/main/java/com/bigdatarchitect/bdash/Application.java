
package com.bigdatarchitect.bdash;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigdatarchitect.bdash.helper.AutowireHelper;
import com.bigdatarchitect.bdash.model.Account;
import com.bigdatarchitect.bdash.repository.AccountRepository;

@SpringBootApplication
/*@EntityScan(basePackages={"com.bigdatarchitect.instancem.Guard"})
@EnableJpaRepositories(basePackages={"com.bigdatarchitect.instancem.GuardRepository"})*/
@RestController

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}

	@Bean
	public AutowireHelper autowireHelper(){
	    return AutowireHelper.getInstance();
	}
}


@Configuration
class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

  @Autowired
  AccountRepository accountRepository;

  @Override
  public void init(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService());
  }

  @Bean
  UserDetailsService userDetailsService() {
    return new UserDetailsService() {

      @Override
      public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByUsername(username);
        if(account != null) {
        return new User(account.getUsername(), account.getPassword(), true, true, true, true,
                AuthorityUtils.createAuthorityList("ROLE_USER"));
        } else {
          throw new UsernameNotFoundException("could not find the user '"
                  + username + "'");
        }
      }
      
    };
  }
}
