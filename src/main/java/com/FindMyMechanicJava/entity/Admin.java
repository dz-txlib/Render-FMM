package com.FindMyMechanicJava.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@Entity
public class Admin {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    private String mobile;

    private String otp;

    private boolean is_deleted; // Soft delete flag

    public Admin( ) {

    }

    public Admin(UUID id, String mobile, String otp, boolean is_deleted) {
        this.id = id;
        this.mobile = mobile;
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
        return "Admin{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", otp='" + otp + '\'' +
                ", is_deleted=" + is_deleted +
                '}';
    }

}
