package com.FindMyMechanicJava.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;


@Entity
public class Sos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String mobile = "";

    private String location;

    private String advance_payment = "";

    private String customer = "";

    public Sos() {
    }

    // Constructor with all fields
    public Sos(String mobile, String location, String advance_payment, String customer) {
        this.mobile = mobile;
        this.location = location;
        this.advance_payment = advance_payment;
        this.customer = customer;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAdvance_payment() {
        return advance_payment;
    }

    public void setAdvance_payment(String advance_payment) {
        this.advance_payment = advance_payment;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
