package com.victorromano.restcourse.repository;

import com.victorromano.restcourse.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepositoryInMemory implements BookRepository {

    private static final Map<Integer, Book> books = new HashMap<>();

    public BookRepositoryInMemory() {
        Book domCasmurro = new Book(1, "Dom Casmurro", "Machado de Assis");
        Book aMetamorfose = new Book(2, "A Metamorfose", "Franz Kafka");

        books.put(domCasmurro.getId(), domCasmurro);
        books.put(aMetamorfose.getId(), aMetamorfose);
    }

    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        bookList.addAll(books.values());
        return bookList;
    }

    @Override
    public Book findById(Book book) {
        return books.get(book.getId());
    }

    @Override
    public Book save(Book book) {
        books.put(book.getId(), book);
        return book;
    }

    @Override
    public void delete(Book book) {
        books.remove(book.getId());
    }

}
