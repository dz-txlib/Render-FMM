package com.FindMyMechanicJava.services;

import com.FindMyMechanicJava.entity.Customer;
import com.FindMyMechanicJava.entity.Sos;
import com.FindMyMechanicJava.repository.CustomerRepository;
import com.FindMyMechanicJava.repository.SosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private SosRepository sosRepository;

    public Customer createCustomers(Customer  customer) {
        try {
            return customerRepository.save(customer);
        } catch (Exception e) {
            // Log the exception
            e.printStackTrace();
            // You can throw a custom exception here or handle it according to your requirement
            throw new RuntimeException("Failed to create customer");
        }
    }

    public Sos applySos(Sos sos) {
        try {
            // Additional processing if needed
            return sosRepository.save(sos);
        } catch (Exception e) {
            // Log the exception
            e.printStackTrace();
            // You can throw a custom exception here or handle it according to your requirement
            throw new RuntimeException("Failed to apply SOS");
        }
    }
}