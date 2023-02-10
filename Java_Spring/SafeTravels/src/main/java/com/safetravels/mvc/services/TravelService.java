package com.safetravels.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safetravels.mvc.models.Travel;
import com.safetravels.mvc.respositories.TravelRepo;


@Service
public class TravelService {
//	private static TravelRepo travelRepo;
//	
//	public TravelService(TravelRepo travelRepo) {
//		TravelService.travelRepo = travelRepo;
//	}
//	
	@Autowired
	private TravelRepo travelRepo;
	
	public List<Travel>all(){
		return travelRepo.findAll();
	}
	
	public Travel create(Travel t) {
		return travelRepo.save(t);
	}
	public Travel update(Travel t) {
		return travelRepo.save(t);
	}
	public Travel find(Long id) {
		Optional<Travel>optional = travelRepo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}
	public void delete(Long id) {
		travelRepo.deleteById(id);
	}


}


