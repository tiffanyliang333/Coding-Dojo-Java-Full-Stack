package com.tv.shows.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tv.shows.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{
	public Optional<User>findByEmail(String email);

}
