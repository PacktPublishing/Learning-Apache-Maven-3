package com.packt.maven.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.packt.maven.dao.BookDao;
import com.packt.maven.model.Book;

public class BookDaoImpl extends HibernateDaoSupport  implements BookDao {
	
	BookDao bookDao;

	@Override
	public void addBook(Book book) {
		book.setIssuedDate(new Date());
		getHibernateTemplate().save(book);
	}

	@Override
	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Book");
		//return null;
	}

}
