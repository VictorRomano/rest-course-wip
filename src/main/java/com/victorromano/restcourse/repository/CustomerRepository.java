package com.victorromano.restcourse.repository;

import com.victorromano.restcourse.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
}
