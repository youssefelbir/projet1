package com.example.gestionpharmacie.repositories;

import com.example.gestionpharmacie.entities.CommandeFournisseur;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur,Long> {

}
