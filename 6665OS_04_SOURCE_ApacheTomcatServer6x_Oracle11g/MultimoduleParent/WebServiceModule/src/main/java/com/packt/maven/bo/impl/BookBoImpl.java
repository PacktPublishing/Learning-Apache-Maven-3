package com.packt.maven.bo.impl;

import java.util.List;

import com.packt.maven.bo.BookBo;
import com.packt.maven.dao.BookDao;
import com.packt.maven.model.Book;

public class BookBoImpl implements BookBo {
	
	BookDao bookDao;
	
	public void setBookDao(BookDao bookDao){
		this.bookDao = bookDao;
	}

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
		
	}

	@Override
	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		return bookDao.findAllBook();
	}

}
