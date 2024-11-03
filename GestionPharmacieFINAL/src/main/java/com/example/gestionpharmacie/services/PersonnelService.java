package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Personnel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface PersonnelService {
    Personnel Save_Personnel(Personnel personnel);
    Personnel Update_Personnel(Personnel personnel);
    void Deletepersonnelbyid(Long id);
    void Deleteallpersonnel(Long id);
    Personnel Getpersonnelbyid(Long id);
    List<Personnel> Getallpersonnel();
}
