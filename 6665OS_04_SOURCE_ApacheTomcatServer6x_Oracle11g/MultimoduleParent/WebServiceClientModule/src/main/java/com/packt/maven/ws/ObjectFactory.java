
package com.packt.maven.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.packt.maven.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindAllBook_QNAME = new QName("http://ws.maven.packt.com/", "findAllBook");
    private final static QName _FindAllBookResponse_QNAME = new QName("http://ws.maven.packt.com/", "findAllBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.packt.maven.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllBook }
     * 
     */
    public FindAllBook createFindAllBook() {
        return new FindAllBook();
    }

    /**
     * Create an instance of {@link FindAllBookResponse }
     * 
     */
    public FindAllBookResponse createFindAllBookResponse() {
        return new FindAllBookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.maven.packt.com/", name = "findAllBook")
    public JAXBElement<FindAllBook> createFindAllBook(FindAllBook value) {
        return new JAXBElement<FindAllBook>(_FindAllBook_QNAME, FindAllBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.maven.packt.com/", name = "findAllBookResponse")
    public JAXBElement<FindAllBookResponse> createFindAllBookResponse(FindAllBookResponse value) {
        return new JAXBElement<FindAllBookResponse>(_FindAllBookResponse_QNAME, FindAllBookResponse.class, null, value);
    }

}
