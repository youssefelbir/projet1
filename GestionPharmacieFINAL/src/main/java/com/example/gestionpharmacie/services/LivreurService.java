package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Facture;
import com.example.gestionpharmacie.entities.Livreur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface LivreurService {
    Livreur saveLivreur(Livreur livreur);
    Livreur updateLivreur(Livreur livreur);
    void deleteLivreurById(long id);
    void deleteAllLivreurs();
    Livreur getLivreurById(long id);
    List<Livreur> getAllLivreurs();
}
