package com.dojos.ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojos.ninjas.models.Dojo;
import com.dojos.ninjas.repositories.DojoRepo;

@Service
public class DojoServ {
	private final DojoRepo repo;
	
	public DojoServ(DojoRepo repo) {
		this.repo=repo;
	}
	
	public List<Dojo> all(){
		return repo.findAll();
	}
	
	public Dojo create(Dojo d) {
		return repo.save(d);
	}
	
	public Dojo find(Long id) {
		Optional<Dojo>optional = repo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

}
