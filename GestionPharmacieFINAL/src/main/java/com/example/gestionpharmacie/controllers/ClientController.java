package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.Client;
import com.example.gestionpharmacie.services.ClientService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class ClientController {
    @Autowired
    private ClientService clientService;

    @RequestMapping("/CreateClient")
    public  String createClient(){
        return "CreateClient";
    }

    @RequestMapping("saveClient")
    public String saveClient(@Valid Client clientController, BindingResult bindingResult, ModelMap modelMap){
        if (bindingResult.hasErrors()) return "CreateClient";

        Client saveClient = clientService.saveClient(clientController);
        return clientList(modelMap);

    }
    @RequestMapping("/ClientsList")
    public String clientList(ModelMap modelMap){
        List<Client> clientsController = clientService.getAllClients();
        modelMap.addAttribute("clientsVue",clientsController);
        return "ClientsList";

    }
    @RequestMapping("/deleteClient")
    public String deleteClient(@RequestParam("id") long id , ModelMap modelMap){
        clientService.deleteClientById(id);
        List<Client> clientsController = clientService.getAllClients();
        modelMap.addAttribute("clientsVue",clientsController);
        return "ClientsList";

    }
    @RequestMapping("/EditClient")
    public String editClient(@RequestParam("id") long id ,ModelMap modelMap){
        Client clientController = clientService.getClientById(id);
        modelMap.addAttribute("clientView" , clientController);
        return "EditClient";


    }
    @RequestMapping("/updateClient")
    public String updateClient(@ModelAttribute("clientVue") Client clientController,ModelMap modelMap){
        clientService.updateClient(clientController);
        return clientList(modelMap);
    }
}
