package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.CommandeFournisseur;
import com.example.gestionpharmacie.entities.FactureFour;
import com.example.gestionpharmacie.repositories.CommandeFournisseurRepository;
import com.example.gestionpharmacie.repositories.FactureFourRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class FactureFourServiceImpl implements FactureFourService {
    private FactureFourRepository factureFourRepository;
    private CommandeFournisseurRepository commandeFournisseurRepository;
    @Override
    public FactureFour SaveFactureFour(FactureFour facturefour) {
        return factureFourRepository.save(facturefour);
    }

    @Override
    public void addCommandefourToFactureFour(Long commandefourId, Long FactureFourId) {
        CommandeFournisseur commandeFournisseur = commandeFournisseurRepository.findById(commandefourId).orElseThrow(() -> new EntityNotFoundException("commandefourId not found"));
        FactureFour factureFour = factureFourRepository.findById(FactureFourId).orElseThrow(() -> new EntityNotFoundException("FactureFourId not found"));}
    public FactureFour UpdateFactureFour(FactureFour facturefour) {
        return factureFourRepository.save(facturefour);
    }

    @Override
    public void Deletefacturefourbyid(Long id) {
        factureFourRepository.deleteById(id);
    }

    @Override
    public void Deleteallfacturefour(Long id) {
        factureFourRepository.deleteAll();
    }

    @Override
    public FactureFour Getfacturefourbyid(Long id) {
        return factureFourRepository.findById(id).get();
    }

    @Override
    public List<FactureFour> Getallfacturefour() {
        return factureFourRepository.findAll();
    }
}
