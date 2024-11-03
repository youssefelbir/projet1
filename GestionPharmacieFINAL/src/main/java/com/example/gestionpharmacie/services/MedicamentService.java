package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Medicament;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MedicamentService {
    Medicament newMedicament(Medicament medicament);
    Medicament updateMedicament(Medicament medicament);
    void addMediBaseToMedicament(Long medicamentId, Long medibaseId);
    void deletMedicamentById(Long id);
    void deletAllMedicament();
    Medicament getMedicamentById(Long id);
    List<Medicament> getAllMedicament();
}
