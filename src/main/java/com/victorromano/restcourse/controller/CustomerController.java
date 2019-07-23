package com.victorromano.restcourse.controller;

import com.victorromano.restcourse.model.Customer;
import com.victorromano.restcourse.repository.CustomerRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping()
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return ResponseEntity
                .created(URI.create("/customers/" + customer.getId().toString()))
                .body(customer);
    }

}
