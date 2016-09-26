package com.bigdatarchitect.bdash.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bigdatarchitect.bdash.model.PermissionPolicyUser;


@RepositoryRestResource
public interface PermissionPolicyUserReposity extends CrudRepository<PermissionPolicyUser, String > {
	
	/*List<PermissionPolicyUser> findByUserName(@Param("UserName") String name);*/
	
}
