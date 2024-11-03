package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.Medicament;
import com.example.gestionpharmacie.entities.Pharmacie;
import com.example.gestionpharmacie.services.PharmacieService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class PharmacieController {
    private PharmacieService pharmacieService;
    @RequestMapping("/ajoutPharmacie")
    public String ajoutPharmacie(){
        return "CreatePharmacie";
    }
    @RequestMapping("newPharmacie")
    public String newPharmacie(@Valid Pharmacie pharmacieC, BindingResult bindingResult, ModelMap modelMap){
        if(bindingResult.hasErrors()){return listepharmacies2(modelMap);}
        Pharmacie newMedicament = pharmacieService.newPharmacie(pharmacieC);
        return listepharmacies2(modelMap);

    }
    @RequestMapping("/listepharmacies")
    public String listepharmacies(ModelMap modelMap){
        List<Pharmacie> pharmaciesC=pharmacieService.getAllPharmacie();
        modelMap.addAttribute("pharmacieVue",pharmaciesC);
        return "ListePharmacies";

    }
    @RequestMapping("/pharmaciesliste")
    public String listepharmacies2(ModelMap modelMap){
        List<Pharmacie> pharmaciesC=pharmacieService.getAllPharmacie();
        modelMap.addAttribute("pharmacieVue2",pharmaciesC);
        return "ListePharmacies2";

    }
    @RequestMapping("/deletePharmacie")
    public String deletePharmacie(@RequestParam("id") Long id,ModelMap modelMap){
        pharmacieService.deletPharmacieById(id);
        List<Pharmacie> pharmaciesC=pharmacieService.getAllPharmacie();
        modelMap.addAttribute("pharmacieVue2",pharmaciesC);
        return "ListePharmacies2";
    }
    @RequestMapping("/editPharmacie")
    public String editPharmacie(@RequestParam("id") Long id , ModelMap modelMap)
    {
        Pharmacie pharmacieCtrl= pharmacieService.getPharmacieById(id);
        modelMap.addAttribute("pharmacieView",pharmacieCtrl);
        return "EditPharmacie";
    }


    @RequestMapping("/updatePharmacie")
    public String updatePharmacie(@ModelAttribute("pharmacie") Pharmacie pharmacieC , ModelMap modelMap){
        pharmacieService.updatePharmacie(pharmacieC);
        return listepharmacies2(modelMap);
    }
}
