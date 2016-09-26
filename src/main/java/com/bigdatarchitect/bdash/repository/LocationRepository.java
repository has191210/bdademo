package com.bigdatarchitect.bdash.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bigdatarchitect.bdash.model.Location;

@RepositoryRestResource(collectionResourceRel = "Location", path = "Location")
public interface LocationRepository extends PagingAndSortingRepository<Location, Integer> {

}




