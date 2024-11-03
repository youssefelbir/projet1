package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.DetailCommandeC;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface DetailCommandeCService {
    DetailCommandeC saveDetailCommandeC(DetailCommandeC detailCommandeC);
    DetailCommandeC updateDetailCommandeC(DetailCommandeC detailCommandeC);
    void deleteDetailCommandeCById(long id);
    void deleteAllDetailCommandeC();
    DetailCommandeC getDetailCommandeCById(long id);
    List<DetailCommandeC> getAllDetailCommandeC();


}

