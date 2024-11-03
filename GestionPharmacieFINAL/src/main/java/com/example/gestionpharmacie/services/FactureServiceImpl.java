package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Client;
import com.example.gestionpharmacie.entities.Facture;
import com.example.gestionpharmacie.repositories.ClientRepository;
import com.example.gestionpharmacie.repositories.FactureRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class FactureServiceImpl implements FactureService  {
    @Autowired
    private FactureRepository factureRepository;
    @Override
    public Facture saveFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public Facture updateFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public void deleteFactureById(long id) {
        factureRepository.deleteById(id);

    }

    @Override
    public void deleteAllFactures() {
        factureRepository.deleteAll();

    }

    @Override
    public Facture getFactureById(long id) {
        return factureRepository.findById(id).get();



    }

    @Override
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }
}

