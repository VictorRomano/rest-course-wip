package com.victorromano.restcourse.repository;

import com.victorromano.restcourse.model.Book;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();

    Book findById(Book book);

    Book save(Book book);

    void delete(Book book);

}
