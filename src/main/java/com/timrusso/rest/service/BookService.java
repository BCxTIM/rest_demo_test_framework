package com.timrusso.rest.service;

import com.timrusso.rest.model.Book;

import java.util.List;

/**
 * Created by tmoiseev on 3/2/2018.
 */
public interface BookService {

    List<Book> getAllBooks();
    void addBook(Book book);
    void update(int id, Book book);
    Book getBook(int id);
    void delete(int id);


}
