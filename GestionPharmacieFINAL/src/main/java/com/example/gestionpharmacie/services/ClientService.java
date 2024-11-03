package com.example.gestionpharmacie.services;

import com.example.gestionpharmacie.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    Client saveClient(Client client);
    Client updateClient(Client client);
    void deleteClientById(long id);
    void deleteAllClients();
    Client getClientById(long id);
    List<Client> getAllClients();

}
