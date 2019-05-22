package com.packt.maven.action;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.packt.maven.bo.BookBo;
import com.packt.maven.model.Book;



public class BookAction implements ModelDriven  {
	
	Book book = new Book();
	
	com.packt.maven.ws.bo.BookBo bookWSBo;
	
	public com.packt.maven.ws.bo.BookBo getBookWSBo() {
		return bookWSBo;
	}

	public void setBookWSBo(com.packt.maven.ws.bo.BookBo bookWSBo) {
		this.bookWSBo = bookWSBo;
	}

	List<com.packt.maven.ws.Book> bookList = new ArrayList<com.packt.maven.ws.Book>();
	
	BookBo bookBo;
	
	public BookBo getBookBo() {
		return bookBo;
	}

	public void setBookBo(BookBo bookBo) {
		this.bookBo = bookBo;
	}

	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return book;
	}
		
	public List<com.packt.maven.ws.Book> getBookList(){
		return bookList;
	}
	
	public void setBookList(List<com.packt.maven.ws.Book> bookList){
		this.bookList = bookList;
	}

	public String addBook() throws Exception{
		
		//save it
		book.setIssuedDate(new Date());
		
		bookBo.addBook(book);
		
		//reload the book list
		bookList = null;
		bookList = bookWSBo.findAllBook();
		
		return "success";
				
	}
	
	public String listBook() throws Exception{		
		bookList = bookWSBo.findAllBook();	

		return "success";		
	}

}
