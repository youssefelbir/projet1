package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.MediBase;
import com.example.gestionpharmacie.entities.Medicament;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MediBaseService {
    MediBase newMediBase(MediBase mediBase);
    MediBase updateMediBase(MediBase mediBase);
    void addMedicamentToMediBase(Long medibaseId, Long medicamentId) ;
    void deletMediBaseById(Long id);
    void deletAllMediBase();
    MediBase getMediBaseById(Long id);
    List<MediBase> getAllMediBase();
}
