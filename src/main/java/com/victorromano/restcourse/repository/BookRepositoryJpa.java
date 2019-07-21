package com.victorromano.restcourse.repository;

import com.victorromano.restcourse.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Primary
@Repository
public class BookRepositoryJpa implements BookRepository {

    private EntityManager entityManager;

    @Autowired
    public BookRepositoryJpa(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Book> findAll() {
        return entityManager
                .createNamedQuery("Book.findAll", Book.class)
                .getResultList();
    }

    @Override
    public Book findById(Book book) {
        return entityManager
                .createNamedQuery("Book.findById", Book.class)
                .setParameter("id", book.getId())
                .getSingleResult();
    }

    @Override
    @Transactional
    public Book save(Book book) {
        if (book.getId() == null) {
            entityManager.persist(book);
            return book;
        } else {
            return entityManager.merge(book);
        }
    }

    @Override
    @Transactional
    public void delete(Book book) {
        Book bookToDelete = entityManager.find(Book.class, book.getId());
        entityManager.remove(bookToDelete);
    }
}
