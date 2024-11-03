package com.example.gestionpharmacie.repositories;

import com.example.gestionpharmacie.entities.FactureFour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureFourRepository extends JpaRepository<FactureFour,Long> {
}
