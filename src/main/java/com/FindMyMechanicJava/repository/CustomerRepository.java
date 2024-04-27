package com.FindMyMechanicJava.repository;

import com.FindMyMechanicJava.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}

