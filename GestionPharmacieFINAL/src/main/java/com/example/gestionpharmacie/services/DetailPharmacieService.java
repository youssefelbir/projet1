package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.DetailPharmacie;
import com.example.gestionpharmacie.entities.Employé;
import org.springframework.stereotype.Service;
import com.example.gestionpharmacie.services.DetailPharmacieService;

import java.util.List;

@Service
public interface DetailPharmacieService {
    DetailPharmacie newDetailPharmacie(DetailPharmacie detailPharmacie);
    DetailPharmacie updateDetailPharmacie(DetailPharmacie detailPharmacie);
    void deletDetailPharmacieById(Long id);
    void deletAllDetailPharmacie();
    DetailPharmacie getDetailPharmacieById(Long id);
    List<DetailPharmacie> getAllDetailPharmacie();
}
