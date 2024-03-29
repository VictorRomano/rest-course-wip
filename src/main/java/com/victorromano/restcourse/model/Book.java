package com.victorromano.restcourse.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NamedQueries({
        @NamedQuery(name = "Book.findAll",
                    query = "select b from Book b"),
        @NamedQuery(name = "Book.findById",
                    query = "select b from Book b where b.id = :id")
})
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue
    private Integer id;
    @NotNull(message = "Title can't be null")
    private String title;
    @NotNull(message = "Author can't be null")
    @NotEmpty(message = "Author can't be empty")
    private String author;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    @Deprecated
    public Book() {
        // Required by JPA
    }

    public Book(Integer id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
