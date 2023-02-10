package com.tv.shows.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tv.shows.models.Show;
import com.tv.shows.repositories.ShowRepo;

@Service
public class ShowService {
	@Autowired
	private ShowRepo showRepo;
	
	public Show findById(Long id) {
		Optional<Show>result = showRepo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		return null;
	}
	
	public List<Show> all(){
		return showRepo.findAll();
	}
	
	public Show upload(Show show) {
		return showRepo.save(show);
	}
	
	public Show update(Show show) {
		return showRepo.save(show);
	}
	
	public void deleteBook(Show show) {
		showRepo.delete(show);
	}

}
