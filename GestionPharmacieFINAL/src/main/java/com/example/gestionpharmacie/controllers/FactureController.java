package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.Facture;
import com.example.gestionpharmacie.services.FactureService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class FactureController {
    @Autowired
    private FactureService factureService;

    @RequestMapping("/CreateFacture")
    public  String createFacture(){
        return "CreateFacture";
    }

    @RequestMapping("saveFacture")
    public String saveFacture(@ModelAttribute("factureVue") Facture factureController){
        Facture saveFacture = factureService.saveFacture(factureController);
        return "CreateFacture";

    }
    @RequestMapping("/FactureList")
    public String factureList(ModelMap modelMap){
        List<Facture> facturesController = factureService.getAllFactures();
        modelMap.addAttribute("factureVue",facturesController);
        return "FactureList";

    }
    @RequestMapping("/deleteFacture")
    public String deleteFacture(@RequestParam("id") long id , ModelMap modelMap){
        factureService.deleteFactureById(id);
        List<Facture> facturesController = factureService.getAllFactures();
        modelMap.addAttribute("facturesVue",facturesController);
        return "FacturesList";

    }
    @RequestMapping("/EditFacture")
    public String editFacture(@RequestParam("id") long id ,ModelMap modelMap){
        Facture factureController = factureService.getFactureById(id);
        modelMap.addAttribute("factureView" , factureController);
        return "EditFacture";


    }
    @RequestMapping("/updateFacture")
    public String updateFacture(@ModelAttribute("factureVue") Facture factureController){
        factureService.updateFacture(factureController);
        return createFacture();
    }
}

