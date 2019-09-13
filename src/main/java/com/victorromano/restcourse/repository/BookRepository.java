package com.victorromano.restcourse.repository;

import com.victorromano.restcourse.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {
}
