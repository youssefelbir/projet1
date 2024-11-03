package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.MediBase;
import com.example.gestionpharmacie.entities.Pharmacie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PharmacieService {
    Pharmacie newPharmacie(Pharmacie pharmacie);
    Pharmacie updatePharmacie(Pharmacie pharmacie);
    void deletPharmacieById(Long id);
    void deletAllPharmacie();
    Pharmacie getPharmacieById(Long id);
    List<Pharmacie> getAllPharmacie();
}
