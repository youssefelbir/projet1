package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.CommandeFournisseur;
import com.example.gestionpharmacie.entities.FactureFour;
import com.example.gestionpharmacie.services.CommandeFournisseurService;
import com.example.gestionpharmacie.services.FactureFourService;
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
public class FactureFourControllers {
    private FactureFourService factureFourService;
    private CommandeFournisseurService commandeFournisseurService;
    @RequestMapping("/ajoutFactureFour")
    public String ajoutFactureFour(ModelMap modelMap){
        List<CommandeFournisseur> commandeFournisseursVue=commandeFournisseurService.Getallcommandefour();
        modelMap.addAttribute("commandeFournisseursVue",commandeFournisseursVue);
        return "CreateFactureFour";
    }
    @RequestMapping("/newFactureFour")
    public String newFactureFour(@Valid FactureFour factureFourC, @RequestParam("commandeFournisseur") long commandefourId, BindingResult bindingResult, ModelMap modelMap){
        CommandeFournisseur commandeFournisseur=commandeFournisseurService.Getcommandefourbyid(commandefourId);
        if(bindingResult.hasErrors()){return ListeFactureFour(modelMap);}
        FactureFour newfacturefour = factureFourC;
        newfacturefour.setCommandeFournisseur(commandeFournisseur);
        factureFourService.SaveFactureFour(newfacturefour);
        return ListeFactureFour(modelMap);

    }
    @RequestMapping("/ListeFactureFour")
    public String ListeFactureFour(ModelMap modelMap){
        List<FactureFour> FactureFourContr=factureFourService.Getallfacturefour();
        modelMap.addAttribute("FactureFourVue",FactureFourContr);
        return "ListeFactureFour";

    }
    @RequestMapping("/deleteFactureFour")
    public String deleteFactureFour(@RequestParam("id") Long id, ModelMap modelMap){
        factureFourService.Deletefacturefourbyid(id);
        List<FactureFour> FactureFourC=factureFourService.Getallfacturefour();
        modelMap.addAttribute("FactureFourVue",FactureFourC);
        return "ListeFactureFour";
    }
    @RequestMapping("/editFactureFour")
    public String editFactureFour(@RequestParam("id") Long id , ModelMap modelMap)
    {
        FactureFour FactureFourCtrl= factureFourService.Getfacturefourbyid(id);
        modelMap.addAttribute("FactureFourView",FactureFourCtrl);
        List<CommandeFournisseur> commandeFournisseursVue=commandeFournisseurService.Getallcommandefour();
        modelMap.addAttribute("commandeFournisseursVue",commandeFournisseursVue);
        return "EditFactureFour";
    }


    @RequestMapping("/updateFactureFour")
    public String updateFactureFour(@ModelAttribute("facturefour") FactureFour FactureFourC ,@RequestParam("commandeFournisseur") long commandefourId, ModelMap modelMap){
        CommandeFournisseur commandeFournisseur=commandeFournisseurService.Getcommandefourbyid(commandefourId);
        FactureFourC.setCommandeFournisseur(commandeFournisseur);
        factureFourService.UpdateFactureFour(FactureFourC);
        return ListeFactureFour(modelMap);
    }


    @PostMapping("/{FactureFourId}/commandeFournisseur/{commandefourId}")
    public ResponseEntity<?> addCommandefourToFactureFour(@PathVariable("FactureFourId") Long FactureFourId, @PathVariable("commandefourId") Long commandefourId) {
        commandeFournisseurService.addPharmacieToCommandeFour(FactureFourId, commandefourId);
        return ResponseEntity.ok().build();

    }

}
