package com.bigdatarchitect.bdash.repository;

import org.springframework.data.repository.CrudRepository;

import com.bigdatarchitect.bdash.model.Account;

public interface AccountRepository extends CrudRepository<Account, String> {
	public Account findByUsername(String username);
}
