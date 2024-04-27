package com.FindMyMechanicJava.controller;

import com.FindMyMechanicJava.configuration.SosRequest;
import com.FindMyMechanicJava.entity.Customer;
import com.FindMyMechanicJava.entity.Sos;
import com.FindMyMechanicJava.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer createCustomers(@RequestBody Customer customer) {
        return customerService.createCustomers(customer);
    }

    @PostMapping("/sos")
    public ResponseEntity<?> applySos(@RequestBody SosRequest sosRequest) {
        // Validate the incoming SOS request
        if (sosRequest == null || sosRequest.getMobile() == null || sosRequest.getLocation() == null || sosRequest.getAdvance_payment() == null || sosRequest.getCustomer() == null) {
            return ResponseEntity.badRequest().body("SOS request is invalid");
        }
        // Create SOS entity with user's live location
        Sos sos = new Sos(sosRequest.getMobile(), sosRequest.getLocation(), sosRequest.getAdvance_payment(), sosRequest.getCustomer());
        try {
            Sos createdSos = customerService.applySos(sos);
            return ResponseEntity.ok(createdSos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to apply SOS: " + e.getMessage());
        }
    }
}
