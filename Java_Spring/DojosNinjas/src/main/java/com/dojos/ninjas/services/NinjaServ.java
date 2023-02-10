package com.dojos.ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojos.ninjas.models.Dojo;
import com.dojos.ninjas.models.Ninja;
import com.dojos.ninjas.repositories.NinjaRepo;

@Service
public class NinjaServ {
	private final NinjaRepo repo;
	
	public NinjaServ (NinjaRepo repo) {
		this.repo=repo;
	}
	
	public List<Ninja>all(){
		return repo.findAll();
	}
	
	public Ninja create(Ninja n) {
		return repo.save(n);
	}
	
	public Ninja find(Long id) {
		Optional<Ninja>optional = repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}
	
	public List<Ninja> ninjaInDojo(Dojo dojo){
		return repo.findAllByDojo(dojo);
	}
}
