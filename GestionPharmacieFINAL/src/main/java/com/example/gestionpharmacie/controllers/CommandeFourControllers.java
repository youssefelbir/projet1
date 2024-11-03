package com.example.gestionpharmacie.controllers;
import com.example.gestionpharmacie.entities.CommandeFournisseur;
import com.example.gestionpharmacie.entities.Pharmacie;
import com.example.gestionpharmacie.services.CommandeFournisseurService;
import com.example.gestionpharmacie.services.PharmacieService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class CommandeFourControllers {
    private CommandeFournisseurService commandeFournisseurService;
    private PharmacieService pharmacieService;
    @RequestMapping("/ajoutCommandeFour")
    public String ajoutCommandeFour(ModelMap modelMap){
        List<Pharmacie> pharmacieVue=pharmacieService.getAllPharmacie();
        modelMap.addAttribute("pharmacieVue",pharmacieVue);
        return "CreateCommandeFour";
    }
    @RequestMapping("newCommandeFour")
    public String newCommandeFour(@Valid CommandeFournisseur CommandeFourC,@RequestParam("pharmacie") long pharmacieId,  BindingResult bindingResult, ModelMap modelMap){
        Pharmacie pharmacie=pharmacieService.getPharmacieById(pharmacieId);
        if(bindingResult.hasErrors()){return listecommandefour(modelMap);}
        CommandeFournisseur newCommandeFournisseur = CommandeFourC;
        newCommandeFournisseur.setPharmacie(pharmacie);

        commandeFournisseurService.SaveCommandeFour(newCommandeFournisseur);
        return listecommandefour(modelMap);
    }
    @RequestMapping("/listecommandefour")
    public String listecommandefour(ModelMap modelMap){
        List<CommandeFournisseur> commandeFournisseurContr=commandeFournisseurService.Getallcommandefour();
        modelMap.addAttribute("commandeFournisseurVue",commandeFournisseurContr);
        return "ListeCommandeFour";

    }
    @RequestMapping("/deleteCommandeFour")
    public String deleteCommandeFour(@RequestParam("id") Long id, ModelMap modelMap){
        commandeFournisseurService.Deletecommandefourbyid(id);
        List<CommandeFournisseur> commandefournisseurC=commandeFournisseurService.Getallcommandefour();
        modelMap.addAttribute("commandeFournisseurVue",commandefournisseurC);
        return "ListeCommandeFour";
    }
    @RequestMapping("/editCommandeFour")
    public String editCommandeFour(@RequestParam("id") Long id , ModelMap modelMap)
    {
        CommandeFournisseur commandeFournisseurCtrl= commandeFournisseurService.Getcommandefourbyid(id);
        modelMap.addAttribute("commandeFournisseurVue",commandeFournisseurCtrl);
        List<Pharmacie> pharmacieVue=pharmacieService.getAllPharmacie();
        modelMap.addAttribute("pharmacieVue",pharmacieVue);
        return "EditCommandeFour";
    }


    @RequestMapping("/updateCommandeFour")
    public String updateCommandeFour(@ModelAttribute("CommandeFour") CommandeFournisseur commandefourC ,@RequestParam("pharmacie") long pharmacieId, ModelMap modelMap){
        Pharmacie pharmacie=pharmacieService.getPharmacieById(pharmacieId);
        commandefourC.setPharmacie(pharmacie);
        commandeFournisseurService.UpdateCommandeFour(commandefourC);
        return listecommandefour(modelMap);
    }
    @PostMapping("/{commandefourId}/pharmacies/{pharmacieId}")
    public ResponseEntity<?> addPharmacieToCommandeFour(@PathVariable("commandefourId") Long commandefourId, @PathVariable("pharmacieId") Long pharmacieId) {
        commandeFournisseurService.addPharmacieToCommandeFour(commandefourId, pharmacieId);
        return ResponseEntity.ok().build();

    }
    }

















