package com.example.gestionpharmacie.repositories;

import com.example.gestionpharmacie.entities.Client;
import com.example.gestionpharmacie.entities.MediBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediBaseRepository extends JpaRepository<MediBase,Long> {
}
