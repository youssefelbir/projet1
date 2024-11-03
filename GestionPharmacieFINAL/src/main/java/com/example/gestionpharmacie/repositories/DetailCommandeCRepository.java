package com.example.gestionpharmacie.repositories;
import com.example.gestionpharmacie.entities.DetailCommandeC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailCommandeCRepository extends JpaRepository<DetailCommandeC,Long> {
}
