package com.login.registration.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.login.registration.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	public Optional<User> findByEmail(String email);

}
