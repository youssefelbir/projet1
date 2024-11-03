package com.example.gestionpharmacie.repositories;

import com.example.gestionpharmacie.entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelRepository extends JpaRepository<Personnel,Long> {
}
