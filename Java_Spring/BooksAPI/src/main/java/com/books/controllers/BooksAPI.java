package com.books.controllers;

import java.awt.print.Book;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksAPI {
private final BookService bookService;

	public void BooksApi(BookService bookService) {
		this.bookService = bookService
				
	@RequestMapping("/api/books")
		public List<Book>index(){
			return bookService.allBooks();
		}
	}
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
	public BooksAPI(
			@RequestParam(value="title") String title,
			@RequestParam(value="description") String desc),
			@RequestParam(value="language") String lang,
			@RequestParam(value="pages") Integer pages),
		Book book = new Book (title, desc, lang, pages);
		return bookService.createBook(book);
	
}
