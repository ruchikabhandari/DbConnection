package com.db.connection.dao.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.db.connection.model.NameDto; 

@Repository
public interface NameRepository extends CrudRepository<NameDto, Integer>  
{  
}  
