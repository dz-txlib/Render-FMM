package com.FindMyMechanicJava.services;

import com.FindMyMechanicJava.entity.Admin;
import com.FindMyMechanicJava.entity.Sos;
import com.FindMyMechanicJava.repository.AdminRepository;
import com.FindMyMechanicJava.repository.SosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private SosRepository sosRepository;

    public Admin createAdmin(Admin admin) {
        try {
            return adminRepository.save(admin);
        } catch (Exception e) {
            // Log the exception
            e.printStackTrace();
            // You can throw a custom exception here or handle it according to your requirement
            throw new RuntimeException("Failed to create admin");
        }
    }

    public List<Sos> getAllSos() {
        try {
            return sosRepository.findAll();
        } catch (Exception e) {
            // Log the exception
            e.printStackTrace();
            // You can throw a custom exception here or handle it according to your requirement
            throw new RuntimeException("Failed to retrieve SOS list");
        }
    }
}