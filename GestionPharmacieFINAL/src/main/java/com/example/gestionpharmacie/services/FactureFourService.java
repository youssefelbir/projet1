package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.FactureFour;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface FactureFourService {
    FactureFour SaveFactureFour(FactureFour facture_four);

    FactureFour UpdateFactureFour(FactureFour facture_four);

    void Deletefacturefourbyid(Long id);
    void addCommandefourToFactureFour(Long commandefourId, Long FactureFourId);

    void Deleteallfacturefour(Long id);

    FactureFour Getfacturefourbyid(Long id);

    List<FactureFour> Getallfacturefour();
}
