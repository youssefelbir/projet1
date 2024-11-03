package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.Client;
import com.example.gestionpharmacie.entities.Livreur;
import com.example.gestionpharmacie.services.ClientService;
import com.example.gestionpharmacie.services.LivreurService;
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

public class LivreurController {
    @Autowired
    private LivreurService livreurService;
    @RequestMapping("/CreateLivreur")
    public  String createLivreur(){
        return "CreateLivreur";
    }
    @RequestMapping("saveLivreur")
    public String saveLivreur(@ModelAttribute("livreurVue") Livreur livreurController,ModelMap modelMap){
        Livreur saveLivreur = livreurService.saveLivreur(livreurController);
        return livreurList(modelMap);

    }
    @RequestMapping("/LivreurList")
    public String livreurList(ModelMap modelMap){
        List<Livreur> livreursController = livreurService.getAllLivreurs();
        modelMap.addAttribute("livreurVue",livreursController);
        return "LivreurList";

    }
    @RequestMapping("/deleteLivreur")
    public String deleteLivreur(@RequestParam("id") long id , ModelMap modelMap){
        livreurService.deleteLivreurById(id);
        return livreurList(modelMap);

    }
    @RequestMapping("/EditLivreur")
    public String editLivreur(@RequestParam("id") long id ,ModelMap modelMap){
        Livreur livreurController = livreurService.getLivreurById(id);
        modelMap.addAttribute("livreurView" , livreurController);
        return "EditLivreur";


    }
    @RequestMapping("/updateLivreur")
    public String updateLivreur(@ModelAttribute("livreurVue") Livreur livreurController,ModelMap modelMap){
        livreurService.updateLivreur(livreurController);
        return livreurList(modelMap);
    }
}
