package com.example.gestionpharmacie.services;
import com.example.gestionpharmacie.entities.Gérant;
import com.example.gestionpharmacie.repositories.GérantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Gerant_Service {
    Gérant Save_Gerant(Gérant gerant);
    Gérant Update_Gerant(Gérant gerant);
    void Deletegerantlbyid(Long id);
    void Deleteallgerant(Long id);
    Gérant Getgerantbyid(Long id);
    List<Gérant> Getallgerant();
}
