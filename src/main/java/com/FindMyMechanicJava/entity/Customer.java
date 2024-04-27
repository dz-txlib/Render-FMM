package com.FindMyMechanicJava.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Customer  {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    private String mobile;

    private String username = "Customer";
    private String otp;

    private boolean is_deleted; // Soft delete flag

    public Customer( ) {

    }

    public Customer(UUID id, String mobile, String username , String otp, boolean is_deleted) {
        this.id = id;
        this.mobile = mobile;
        this.username = username;
        this.otp = otp;
        this.is_deleted = is_deleted;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", username='" + username + '\'' +
                ", otp='" + otp + '\'' +
                ", is_deleted=" + is_deleted +
                '}';
    }
}
