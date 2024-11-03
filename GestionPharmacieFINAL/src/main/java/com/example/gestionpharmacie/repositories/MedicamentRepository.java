package com.example.gestionpharmacie.repositories;
import com.example.gestionpharmacie.entities.Client;
import com.example.gestionpharmacie.entities.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentRepository extends JpaRepository<Medicament,Long> {
}


