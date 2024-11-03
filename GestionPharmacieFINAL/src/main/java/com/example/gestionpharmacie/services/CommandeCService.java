package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Client;
import com.example.gestionpharmacie.entities.CommandeC;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface CommandeCService {
    CommandeC saveCommandeC(CommandeC commandeC);
    CommandeC updateCommandeC(CommandeC commandeC);
    void deleteCommandeCById(long id);
    void deleteAllCommandeC();
    CommandeC getCommandeCById(long id);
    List<CommandeC> getAllCommandeC();
}
