package com.victorromano.restcourse.repository;

import com.victorromano.restcourse.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
