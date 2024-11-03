package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Gérant;
import com.example.gestionpharmacie.repositories.GérantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class GerantServiceImpl implements GerantService {
    private GérantRepository gerantRepository;
    @Override
    public Gérant Save_Gerant(Gérant gerant) {
        return gerantRepository.save(gerant);
    }

    @Override
    public Gérant Update_Gerant(Gérant gerant) {
        return gerantRepository.save(gerant);
    }

    @Override
    public void Deletegerantlbyid(Long id) {
        gerantRepository.deleteById(id);
    }

    @Override
    public void Deleteallgerant(Long id) {
            gerantRepository.deleteAll();
    }

    @Override
    public Gérant Getgerantbyid(Long id) {
        return gerantRepository.findById(id).get();
    }

    @Override
    public List<Gérant> Getallgerant() {
        return gerantRepository.findAll();
    }
}
