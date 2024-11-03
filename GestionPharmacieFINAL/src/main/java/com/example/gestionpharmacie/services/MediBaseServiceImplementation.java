package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.MediBase;
import com.example.gestionpharmacie.entities.Medicament;
import com.example.gestionpharmacie.repositories.MediBaseRepository;
import com.example.gestionpharmacie.repositories.MedicamentRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MediBaseServiceImplementation implements MediBaseService{
    private MediBaseRepository mediBaseRepository;
    private MedicamentRepository medicamentRepository;
    @Override
    public void addMedicamentToMediBase(Long medibaseId, Long medicamentId) {
        MediBase medibase = mediBaseRepository.findById(medibaseId).orElseThrow(() -> new EntityNotFoundException("MediBase not found"));
        Medicament medicament = medicamentRepository.findById(medicamentId).orElseThrow(() -> new EntityNotFoundException("Medicament not found"));}
    @Override
    public MediBase newMediBase(MediBase mediBase) {
        return mediBaseRepository.save(mediBase);
    }

    @Override
    public MediBase updateMediBase(MediBase mediBase) {
        return mediBaseRepository.save(mediBase);
    }

    @Override
    public void deletMediBaseById(Long id) {
        mediBaseRepository.deleteById(id);
    }

    @Override
    public void deletAllMediBase() {
        mediBaseRepository.deleteAll();
    }

    @Override
    public MediBase getMediBaseById(Long id) {
        return mediBaseRepository.findById(id).get();
    }

    @Override
    public List<MediBase> getAllMediBase() {
        return mediBaseRepository.findAll();
    }
}
