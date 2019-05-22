package com.packt.maven.model;

import java.util.Date;




public class Book implements java.io.Serializable{
	
	private long bookId;
	private String name;
	private String authorName;
	private Date issuedDate;
	private String price;
	
	

	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	

	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

}
