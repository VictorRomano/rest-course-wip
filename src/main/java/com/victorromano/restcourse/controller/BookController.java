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

    @GetMapping
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Book findById(@PathVariable("id") Integer id) {
        return bookRepository.findById(id);
    }

    @PostMapping
    public Book save(@RequestBody Book book) {
        bookRepository.save(book);
        return book;
    }

    @PutMapping
    public Book update(@RequestBody Book book) {
        bookRepository.save(book);
        return book;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        bookRepository.delete(id);
    }

}
