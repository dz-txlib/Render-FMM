package com.FindMyMechanicJava.configuration;

public class SosRequest {
    private String mobile;
    private String location;
    private String advance_payment;
    private String customer;

    public SosRequest() {
    }

    public SosRequest(String mobile, String location, String advance_payment, String customer) {
        this.mobile = mobile;
        this.location = location;
        this.advance_payment = advance_payment;
        this.customer = customer;
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

    @Override
    public String toString() {
        return "SosRequest{" +
                "mobile='" + mobile + '\'' +
                ", location='" + location + '\'' +
                ", advance_payment='" + advance_payment + '\'' +
                ", customer='" + customer + '\'' +
                '}';
    }


}
