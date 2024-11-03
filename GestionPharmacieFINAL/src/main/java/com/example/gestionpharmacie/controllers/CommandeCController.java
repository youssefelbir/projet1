package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.Client;
import com.example.gestionpharmacie.entities.CommandeC;
import com.example.gestionpharmacie.services.ClientService;
import com.example.gestionpharmacie.services.CommandeCService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor

public class CommandeCController {
    @Autowired
    private CommandeCService commandeCService;

    @RequestMapping("/CreateCommandeC")
    public String createCommandeC() {
        return "CreateCommandeC";
    }

    @RequestMapping("saveCommandeC")
    public String saveCommandeC(@ModelAttribute("commandeCVue") CommandeC commandeCController, ModelMap modelMap)
    // @RequestParam("dateCommande") String dateCommande)throws ParseException
    {
        // SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        // datecreation = dateFormat.parse(String.valueOf(dateCommande));
        // commandeCController.setDateCommande(datecreation);
        CommandeC saveCommandeC = commandeCService.saveCommandeC(commandeCController);
        return commandeCList(modelMap);

    }

    @RequestMapping("/CommandeCList")
    public String commandeCList(ModelMap modelMap) {
        List<CommandeC> commandeCController = commandeCService.getAllCommandeC();
        modelMap.addAttribute("commandeCVue", commandeCController);
        return "CommandeCList";

    }

    @RequestMapping("/deleteCommandeC")
    public String deleteCommandeC(@RequestParam("id") long id, ModelMap modelMap) {
        commandeCService.deleteCommandeCById(id);
        return commandeCList(modelMap);

    }

    @RequestMapping("/EditCommandeC")
    public String editCommandeC(@RequestParam("id") long id, ModelMap modelMap) {
        CommandeC commandeCController = commandeCService.getCommandeCById(id);
        modelMap.addAttribute("commandeCView", commandeCController);
        return "EditCommandeC";


    }

    @RequestMapping("/updateCommandeC")
    public String updateCommandeC(@ModelAttribute("commandeCVue") CommandeC commandeCController, ModelMap modelMap) {
        commandeCService.updateCommandeC(commandeCController);
        return commandeCList(modelMap);
    }
}
