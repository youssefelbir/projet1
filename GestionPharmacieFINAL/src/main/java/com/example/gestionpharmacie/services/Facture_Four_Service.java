package com.example.gestionpharmacie.services;
import com.example.gestionpharmacie.entities.FactureFour;
import com.example.gestionpharmacie.repositories.FactureFourRepository;
import com.example.gestionpharmacie.entities.FactureFour;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Facture_Four_Service {
    FactureFour Save_Facture_Four(FactureFour facture_four);
    FactureFour Update_Facture_Four(FactureFour facture_four);
    void Deletefacturefourbyid(Long id);
    void Deleteallfacturefour(Long id);
    FactureFour Getfacturefourbyid(Long id);
    List<FactureFour> Getallfacturefour();
}
