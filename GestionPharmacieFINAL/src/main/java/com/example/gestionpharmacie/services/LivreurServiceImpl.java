package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Client;
import com.example.gestionpharmacie.entities.Livreur;
import com.example.gestionpharmacie.repositories.ClientRepository;
import com.example.gestionpharmacie.repositories.LivreurRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class LivreurServiceImpl implements LivreurService {
    @Autowired
    private LivreurRepository livreurRepository;
    @Override
    public Livreur saveLivreur(Livreur livreur) {
        return livreurRepository.save(livreur);
    }

    @Override
    public Livreur updateLivreur(Livreur livreur) {
        return livreurRepository.save(livreur);
    }

    @Override
    public void deleteLivreurById(long id) {
        livreurRepository.deleteById(id);

    }

    @Override
    public void deleteAllLivreurs() {
        livreurRepository.deleteAll();

    }

    @Override
    public Livreur getLivreurById(long id) {
        return livreurRepository.findById(id).get();



    }

    @Override
    public List<Livreur> getAllLivreurs() {
        return livreurRepository.findAll();
    }
}
