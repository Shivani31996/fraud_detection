package com.amigoscode.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CustomerRepository extends JpaRepository<Customer, Id> {

}
