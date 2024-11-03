package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Gérant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface GerantService {
    Gérant Save_Gerant(Gérant gerant);
    Gérant Update_Gerant(Gérant gerant);
    void Deletegerantlbyid(Long id);
    void Deleteallgerant(Long id);
    Gérant Getgerantbyid(Long id);
    List<Gérant> Getallgerant();
}
