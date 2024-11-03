package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Personnel;
import com.example.gestionpharmacie.repositories.PersonnelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class Personnel_Service_Impl implements Personnel_Service{
    private PersonnelRepository personnelRepository;
    @Override
    public Personnel Save_Personnel(Personnel personnel) {
        return personnelRepository.save(personnel);

    }

    @Override
    public Personnel Update_Personnel(Personnel personnel) {
        return personnelRepository.save(personnel);
    }

    @Override
    public void Deletepersonnelbyid(Long id) {
        personnelRepository.deleteById(id);
    }

    @Override
    public void Deleteallpersonnel(Long id) {
        personnelRepository.deleteAll();
    }

    @Override
    public Personnel Getpersonnelbyid(Long id) {
        return personnelRepository.findById(id).get();

    }

    @Override
    public List<Personnel> Getallpersonnel() {
        return personnelRepository.findAll();
    }
}
