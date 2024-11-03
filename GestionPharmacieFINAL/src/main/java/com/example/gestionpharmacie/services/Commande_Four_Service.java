package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.CommandeFournisseur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Commande_Four_Service {
    CommandeFournisseur Save_Commande_Four(CommandeFournisseur commande_four);
    CommandeFournisseur Update_Commande_Four(CommandeFournisseur commande_four);
    void Deletecommandefourbyid(Long id);
    void Deleteallcommandefour(Long id);
    CommandeFournisseur Getcommandefourbyid(Long id);
    List<CommandeFournisseur> Getallcommandefour();
}
