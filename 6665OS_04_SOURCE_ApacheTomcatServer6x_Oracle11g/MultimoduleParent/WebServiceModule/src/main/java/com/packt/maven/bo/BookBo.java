package com.packt.maven.bo;

import java.util.List;

import com.packt.maven.model.Book;

public interface BookBo {
	
	void addBook(Book Book);
	
	List<Book> findAllBook();

}
