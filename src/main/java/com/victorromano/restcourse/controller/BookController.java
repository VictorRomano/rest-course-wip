package com.victorromano.restcourse.controller;

import com.victorromano.restcourse.model.Book;
import com.victorromano.restcourse.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book findById(@PathVariable("id") Integer id) {
        return bookRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Book save(@RequestBody Book book) {
        bookRepository.save(book);
        return book;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Book update(@RequestBody Book book) {
        bookRepository.save(book);
        return book;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        bookRepository.delete(id);
    }

}
