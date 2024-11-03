package com.example.gestionpharmacie.repositories;

import com.example.gestionpharmacie.entities.Facture;
import com.example.gestionpharmacie.entities.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LivreurRepository extends JpaRepository<Livreur,Long> {
}
