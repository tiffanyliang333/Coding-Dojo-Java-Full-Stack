package com.book.club.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.book.club.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	public List<Book> findAll();

}
