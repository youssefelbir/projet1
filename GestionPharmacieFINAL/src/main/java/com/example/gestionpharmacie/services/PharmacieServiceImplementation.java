package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Pharmacie;
import com.example.gestionpharmacie.repositories.MediBaseRepository;
import com.example.gestionpharmacie.repositories.PharmacieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PharmacieServiceImplementation implements PharmacieService{
    private PharmacieRepository pharmacieRepository;
    @Override
    public Pharmacie newPharmacie(Pharmacie pharmacie) {
        return pharmacieRepository.save(pharmacie);
    }

    @Override
    public Pharmacie updatePharmacie(Pharmacie pharmacie) {
        return pharmacieRepository.save(pharmacie);
    }

    @Override
    public void deletPharmacieById(Long id) {
        pharmacieRepository.deleteById(id);

    }

    @Override
    public void deletAllPharmacie() {
            pharmacieRepository.deleteAll();
    }

    @Override
    public Pharmacie getPharmacieById(Long id) {
        return pharmacieRepository.findById(id).get();
    }

    @Override
    public List<Pharmacie> getAllPharmacie() {
        return pharmacieRepository.findAll();
    }
}
