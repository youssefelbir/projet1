package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.CommandeFournisseur;
import com.example.gestionpharmacie.entities.Employé;
import com.example.gestionpharmacie.entities.Pharmacie;
import com.example.gestionpharmacie.repositories.CommandeFournisseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Commande_Four_Service_Impl implements Commande_Four_Service{
    private CommandeFournisseurRepository commandeFournisseurRepository ;

    @Override
    public CommandeFournisseur Save_Commande_Four(CommandeFournisseur commande_four) {
        return commandeFournisseurRepository.save(commande_four);
    }

    @Override
    public CommandeFournisseur Update_Commande_Four(CommandeFournisseur commande_four) {
        return null;
    }

    @Override
    public void Deletecommandefourbyid(Long id) {

    }

    @Override
    public void Deleteallcommandefour(Long id) {

    }

    @Override
    public CommandeFournisseur Getcommandefourbyid(Long id) {
        return null;
    }

    @Override
    public List<CommandeFournisseur> Getallcommandefour() {
        return null;
    }
}
