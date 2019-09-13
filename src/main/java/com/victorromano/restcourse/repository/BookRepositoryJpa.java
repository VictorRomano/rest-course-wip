package com.victorromano.restcourse.repository;

import com.victorromano.restcourse.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.transaction.Transactional;
import java.util.List;

@Primary
//@Repository
public class BookRepositoryJpa {

//    private EntityManager entityManager;
//
//    @Autowired
//    public BookRepositoryJpa(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public List<Book> findAll(String title) {
//        String query = "select b from Book b";
//        if (title != null) {
//            query = query + " where b.title = :title";
//        }
//
//        TypedQuery<Book> typedQuery = entityManager.createQuery(query, Book.class);
//        if (title != null) {
//            typedQuery.setParameter("title", title);
//        }
//
//        return typedQuery.getResultList();
//    }
//
//    @Override
//    public Book findById(Book book) {
//        return entityManager
//                .createNamedQuery("Book.findById", Book.class)
//                .setParameter("id", book.getId())
//                .getSingleResult();
//    }
//
//    @Override
//    public Book findById(Integer id) {
//        return entityManager
//                .createNamedQuery("Book.findById", Book.class)
//                .setParameter("id", id)
//                .getSingleResult();
//    }
//
//    @Override
//    @Transactional
//    public Book save(Book book) {
//        if (book.getId() == null) {
//            entityManager.persist(book);
//            return book;
//        } else {
//            return entityManager.merge(book);
//        }
//    }
//
//    @Override
//    @Transactional
//    public void delete(Integer id) {
//        Book bookToDelete = entityManager.find(Book.class, id);
//        entityManager.remove(bookToDelete);
//    }

}
