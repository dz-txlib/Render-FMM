package com.FindMyMechanicJava.repository;

import com.FindMyMechanicJava.entity.Sos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SosRepository extends JpaRepository<Sos, UUID> {

}

