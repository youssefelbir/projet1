package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.DetailPharmacie;
import com.example.gestionpharmacie.repositories.DetailPharmacieRepository;
import com.example.gestionpharmacie.repositories.MedicamentRepository;
import com.example.gestionpharmacie.repositories.PharmacieRepository;
import com.example.gestionpharmacie.services.DetailPharmacieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailPharmacieServiceImplementation implements DetailPharmacieService{
    private DetailPharmacieRepository detailPharmacieRepository;
    private MedicamentRepository medicamentRepository;
    private PharmacieRepository pharmacieRepository;
    @Override
    public DetailPharmacie newDetailPharmacie(DetailPharmacie detailPharmacie) {
        return detailPharmacieRepository.save(detailPharmacie);
    }

    @Override
    public DetailPharmacie updateDetailPharmacie(DetailPharmacie detailPharmacie) {
        return detailPharmacieRepository.save(detailPharmacie);
    }

    @Override
    public void deletDetailPharmacieById(Long id) {
        detailPharmacieRepository.deleteById(id);
    }

    @Override
    public void deletAllDetailPharmacie() {
        detailPharmacieRepository.deleteAll();
    }

    @Override
    public DetailPharmacie getDetailPharmacieById(Long id) {
        return detailPharmacieRepository.findById(id).get();
    }

    @Override
    public List<DetailPharmacie> getAllDetailPharmacie() {
        return detailPharmacieRepository.findAll();
    }
}
