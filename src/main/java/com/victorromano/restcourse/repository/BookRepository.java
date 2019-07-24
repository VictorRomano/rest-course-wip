package com.victorromano.restcourse.repository;

import com.victorromano.restcourse.model.Book;

import java.util.List;

public interface BookRepository {

    List<Book> findAll(String title);

    @Deprecated
    Book findById(Book book);

    Book findById(Integer id);

    Book save(Book book);

    void delete(Integer id);

}
