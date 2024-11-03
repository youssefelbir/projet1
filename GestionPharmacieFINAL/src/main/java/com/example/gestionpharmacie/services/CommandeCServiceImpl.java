package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Client;
import com.example.gestionpharmacie.entities.CommandeC;
import com.example.gestionpharmacie.repositories.ClientRepository;
import com.example.gestionpharmacie.repositories.CommandeCRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CommandeCServiceImpl implements CommandeCService {
    @Autowired
    private CommandeCRepository commandeCRepository;
    @Override
    public CommandeC saveCommandeC(CommandeC commandeC) {
        return commandeCRepository.save(commandeC);
    }

    @Override
    public CommandeC updateCommandeC(CommandeC commandeC) {
        return commandeCRepository.save(commandeC);
    }

    @Override
    public void deleteCommandeCById(long id) {
        commandeCRepository.deleteById(id);

    }

    @Override
    public void deleteAllCommandeC() {
        commandeCRepository.deleteAll();

    }

    @Override
    public CommandeC getCommandeCById(long id) {
        return commandeCRepository.findById(id).get();
    }

    @Override
    public List<CommandeC> getAllCommandeC() {
        return commandeCRepository.findAll();
    }
}
