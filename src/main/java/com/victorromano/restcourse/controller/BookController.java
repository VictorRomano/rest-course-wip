package com.victorromano.restcourse.controller;

import com.victorromano.restcourse.model.Book;
import com.victorromano.restcourse.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/books")
public class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(path = "/findAll", method = RequestMethod.POST)
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @RequestMapping(path = "/findById", method = RequestMethod.POST)
    public Book findById(@RequestBody Book book) {
        return bookRepository.findById(book);
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public Book save(@RequestBody Book book) {
        bookRepository.save(book);
        return book;
    }

    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public Book update(@RequestBody Book book) {
        bookRepository.save(book);
        return book;
    }

    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Book book) {
        bookRepository.delete(book);
    }

}
