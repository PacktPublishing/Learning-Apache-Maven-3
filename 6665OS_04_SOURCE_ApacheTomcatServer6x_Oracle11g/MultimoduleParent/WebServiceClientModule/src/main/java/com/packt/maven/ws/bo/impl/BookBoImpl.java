package com.packt.maven.ws.bo.impl;

import com.packt.maven.ws.Book;
import com.packt.maven.ws.BookWS;
import com.packt.maven.ws.BookWSService;
import com.packt.maven.ws.bo.BookBo;


import java.util.List;

public class BookBoImpl implements BookBo {
	
	private BookWSService bookService;
	
	private BookWS bookWS;
	
	@Override
	public List<Book> findAllBook() {
		bookService = new BookWSService();
		bookWS = bookService.getBookWSPort();
		return bookWS.findAllBook();
	}

}
