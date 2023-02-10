package com.project.manager.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.manager.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	List<User>findAll();
	public Optional<User> findByEmail(String email);
	User findByIdIs(Long id);

}
