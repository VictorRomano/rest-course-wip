package com.victorromano.restcourse.repository;

import com.victorromano.restcourse.model.Library;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LibraryRepository extends PagingAndSortingRepository<Library, Integer> {
}
