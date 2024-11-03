package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.CommandeFournisseur;
import com.example.gestionpharmacie.entities.Pharmacie;
import com.example.gestionpharmacie.repositories.CommandeFournisseurRepository;
import com.example.gestionpharmacie.repositories.PharmacieRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandeFournisseurServiceImpl implements CommandeFournisseurService{
    private CommandeFournisseurRepository commandeFournisseurRepository;
    private PharmacieRepository pharmacieRepository;
    @Override
    public CommandeFournisseur SaveCommandeFour(CommandeFournisseur commandefour) {
        return commandeFournisseurRepository.save(commandefour);
    }
    public void addPharmacieToCommandeFour(Long pharmacieId, Long commandefourId) {
        Pharmacie pharmacie = pharmacieRepository.findById(pharmacieId).orElseThrow(() -> new EntityNotFoundException("pharmacie not found"));
        CommandeFournisseur commandeFournisseur = commandeFournisseurRepository.findById(commandefourId).orElseThrow(() -> new EntityNotFoundException("commandefour not found"));}

    @Override
    public CommandeFournisseur UpdateCommandeFour(CommandeFournisseur commandefour) {
        return commandeFournisseurRepository.save(commandefour);
    }

    @Override
    public void Deletecommandefourbyid(Long id) {
        commandeFournisseurRepository.deleteById(id);
    }

    @Override
    public void Deleteallcommandefour(Long id) {
        commandeFournisseurRepository.deleteAll();

    }

    @Override
    public CommandeFournisseur Getcommandefourbyid(Long id) {
        return commandeFournisseurRepository.findById(id).get();
    }

    @Override
    public List<CommandeFournisseur> Getallcommandefour() {
        return commandeFournisseurRepository.findAll();
    }
}
