package com.packt.maven.ws;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
 
import com.packt.maven.bo.BookBo;
import com.packt.maven.model.Book;
 
@WebService
public class BookWS{
 

    BookBo bookBo;
 
    @WebMethod(exclude=true)
    public void setBookBo(BookBo bookBo) {
        this.bookBo = bookBo;
    }
 
    
    
    @WebMethod(operationName="findAllBook")
    public List<Book> findAllBook() {
 
        return bookBo.findAllBook();
 
    }
 
}
