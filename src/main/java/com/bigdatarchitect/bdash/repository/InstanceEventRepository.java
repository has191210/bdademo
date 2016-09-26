package com.bigdatarchitect.bdash.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bigdatarchitect.bdash.model.InstanceEvent;
import org.springframework.security.access.prepost.PreAuthorize;

@PreAuthorize("hasRole('ROLE_USER')")
@RepositoryRestResource(collectionResourceRel = "InstanceEvent", path = "InstanceEvent")
public interface InstanceEventRepository extends PagingAndSortingRepository<InstanceEvent, Integer> {

}




