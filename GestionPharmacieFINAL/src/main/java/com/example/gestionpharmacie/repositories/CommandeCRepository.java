package com.example.gestionpharmacie.repositories;

import com.example.gestionpharmacie.entities.CommandeC;
import com.example.gestionpharmacie.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CommandeCRepository extends JpaRepository<CommandeC,Long> {
}
