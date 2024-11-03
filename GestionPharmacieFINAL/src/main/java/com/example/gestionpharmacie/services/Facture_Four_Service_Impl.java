package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.FactureFour;
import com.example.gestionpharmacie.repositories.FactureFourRepository;
import com.example.gestionpharmacie.entities.FactureFour;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class Facture_Four_Service_Impl implements Facture_Four_Service{
    private FactureFourRepository factureFourRepository;
    @Override
    public FactureFour Save_Facture_Four(FactureFour facture_four) {
        return factureFourRepository.save(facture_four);
    }

    @Override
    public FactureFour Update_Facture_Four(FactureFour facture_four) {
        return factureFourRepository.save(facture_four);
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
