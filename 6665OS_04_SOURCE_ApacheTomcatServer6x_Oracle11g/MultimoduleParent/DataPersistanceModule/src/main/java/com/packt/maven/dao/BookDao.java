package com.packt.maven.dao;

import java.util.List;

import com.packt.maven.model.Book;

public interface BookDao {
	
	void addBook(Book book);
	
	List<Book> findAllBook();

}