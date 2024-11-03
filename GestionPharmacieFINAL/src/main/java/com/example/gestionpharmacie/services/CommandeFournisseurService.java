package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.CommandeFournisseur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface CommandeFournisseurService {
    CommandeFournisseur SaveCommandeFour(CommandeFournisseur commandefour);
    CommandeFournisseur UpdateCommandeFour(CommandeFournisseur commandefour);
    void Deletecommandefourbyid(Long id);
    void Deleteallcommandefour(Long id);
    void addPharmacieToCommandeFour(Long commandefourId, Long pharmacieId);

    CommandeFournisseur Getcommandefourbyid(Long id);
    List<CommandeFournisseur> Getallcommandefour();
}
