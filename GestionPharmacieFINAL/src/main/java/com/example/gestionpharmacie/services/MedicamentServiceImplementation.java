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
public class MedicamentServiceImplementation implements MedicamentService{
    private MedicamentRepository medicamentRepository;
    private MediBaseRepository medibaseRepository;
    @Override
    public void addMediBaseToMedicament(Long medicamentId, Long medibaseId) {
        Medicament medicament = medicamentRepository.findById(medicamentId).get();
        MediBase medibase = medibaseRepository.findById(medibaseId).get();}
    @Override
    public Medicament newMedicament(Medicament medicament) {
        return medicamentRepository.save(medicament);
    }

    @Override
    public Medicament updateMedicament(Medicament medicament) {
        return medicamentRepository.save(medicament);
    }

    @Override
    public void deletMedicamentById(Long id) {
        medicamentRepository.deleteById(id);
    }

    @Override
    public void deletAllMedicament() {
        medicamentRepository.deleteAll();

    }

    @Override
    public Medicament getMedicamentById(Long id) {
        return medicamentRepository.findById(id).get();
    }

    @Override
    public List<Medicament> getAllMedicament() {
        return medicamentRepository.findAll();
    }
}
