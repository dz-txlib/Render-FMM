package com.FindMyMechanicJava.repository;

import com.FindMyMechanicJava.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdminRepository extends JpaRepository<Admin, UUID> {

}

