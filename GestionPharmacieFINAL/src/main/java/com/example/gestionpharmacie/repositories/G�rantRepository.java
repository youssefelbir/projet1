package com.example.gestionpharmacie.repositories;

import com.example.gestionpharmacie.entities.Gérant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GérantRepository extends JpaRepository<Gérant,Long> {
}
