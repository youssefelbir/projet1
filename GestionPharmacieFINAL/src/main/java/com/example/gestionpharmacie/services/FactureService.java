package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Client;
import com.example.gestionpharmacie.entities.Facture;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface FactureService {
    Facture saveFacture(Facture facture);
    Facture updateFacture(Facture facture);
    void deleteFactureById(long id);
    void deleteAllFactures();
    Facture getFactureById(long id);
    List<Facture> getAllFactures();
}
