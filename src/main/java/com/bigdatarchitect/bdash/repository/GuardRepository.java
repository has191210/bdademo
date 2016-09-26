package com.bigdatarchitect.bdash.repository;

import java.util.List;

//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bigdatarchitect.bdash.model.Guard;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;



@RepositoryRestResource(collectionResourceRel = "guard", path = "guard")
/*@Repository*/
/*public interface GuardRepository extends CrudRepository<Guard, String> {*/
public interface GuardRepository extends PagingAndSortingRepository<Guard, Long> {	

    
	/*@RestResource(path="test", rel="test")*/
	List<Guard> findByLastName(@Param("name") String name);
    
/*    @Query ("select * from guard where id=:id")
    Guard findByGuardId(@Param("id") Integer id);
*/
}
