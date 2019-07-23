package com.victorromano.restcourse.repository;

import com.victorromano.restcourse.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
