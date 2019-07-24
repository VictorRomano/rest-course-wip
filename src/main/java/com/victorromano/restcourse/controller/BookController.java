package com.victorromano.restcourse.controller;

import com.victorromano.restcourse.model.Book;
import com.victorromano.restcourse.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
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
    public ResponseEntity<List<Book>> findAll(String title) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookRepository.findAll(title));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Book> findById(@PathVariable("id") Integer id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Book> save(@RequestBody Book book) {
        bookRepository.save(book);
        return ResponseEntity
                .created(URI.create("/books/" + book.getId()))
                .body(book);
    }

    @PutMapping
    public ResponseEntity<Book> update(@RequestBody Book book) {
        bookRepository.save(book);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(book);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id) {
        bookRepository.delete(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }

}
