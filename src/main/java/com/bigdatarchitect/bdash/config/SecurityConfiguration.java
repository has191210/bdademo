package com.bigdatarchitect.bdash.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.bigdatarchitect.bdash.model.Account;
import com.bigdatarchitect.bdash.repository.AccountRepository;



@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

/*	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/").access("hasRole('READER')").antMatchers("/**").permitAll()
		.and()
		.formLogin()
			.loginPage("/login")
			.failureUrl("/login/?error=true");
	}
*/
	
	
	  
/*	  protected void configure(HttpSecurity http) throws Exception {
	    http.authorizeRequests()
	    .antMatchers("index.html","login.html").permitAll()
	    .anyRequest().fullyAuthenticated().and()
	    .httpBasic().and()
	    .csrf().disable();
	    }
	*/
	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
	     http.authorizeRequests()
	    .antMatchers("/home","/", "/bower_components/**", "/styles/**", "/scripts/**", "/login","/data.js", "/views/login.html", "/hello/**", "/InstanceEventType", "/Location").permitAll()
	    .anyRequest().fullyAuthenticated().and()
	    .httpBasic().and()
                 .csrf().disable();
	    }
	  
}
