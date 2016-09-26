package com.bigdatarchitect.bdash.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bigdatarchitect.bdash.model.InstanceEventType;

@RepositoryRestResource(collectionResourceRel = "InstanceEventType", path = "InstanceEventType")
public interface InstanceEventTypeRepository extends PagingAndSortingRepository<InstanceEventType, Integer> {

}




