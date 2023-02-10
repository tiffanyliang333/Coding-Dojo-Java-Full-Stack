package com.dojos.ninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojos.ninjas.models.Dojo;
import com.dojos.ninjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}
