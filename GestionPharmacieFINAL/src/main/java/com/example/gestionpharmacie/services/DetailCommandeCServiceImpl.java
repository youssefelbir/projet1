package com.example.gestionpharmacie.services;
import com.example.gestionpharmacie.entities.DetailCommandeC;
import com.example.gestionpharmacie.repositories.DetailCommandeCRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DetailCommandeCServiceImpl implements DetailCommandeCService {
    @Autowired
    private DetailCommandeCRepository detailCommandeCRepository;
    @Override
    public DetailCommandeC saveDetailCommandeC(DetailCommandeC detailCommandeC) {
        return detailCommandeCRepository.save(detailCommandeC);
    }

    @Override
    public DetailCommandeC updateDetailCommandeC(DetailCommandeC detailCommandeC) {
        return detailCommandeCRepository.save(detailCommandeC);
    }

    @Override
    public void deleteDetailCommandeCById(long id) {
        detailCommandeCRepository.deleteById(id);

    }

    @Override
    public void deleteAllDetailCommandeC() {
        detailCommandeCRepository.deleteAll();

    }

    @Override
    public DetailCommandeC getDetailCommandeCById(long id) {
        return detailCommandeCRepository.findById(id).get();



    }

    @Override
    public List<DetailCommandeC> getAllDetailCommandeC() {
        return detailCommandeCRepository.findAll();
    }


}
