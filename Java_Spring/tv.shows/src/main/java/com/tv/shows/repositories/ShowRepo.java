package com.tv.shows.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tv.shows.models.Show;

public interface ShowRepo extends CrudRepository<Show, Long> {
	public List<Show>findAll();

}
