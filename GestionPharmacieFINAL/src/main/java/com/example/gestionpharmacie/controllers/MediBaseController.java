package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.MediBase;
import com.example.gestionpharmacie.entities.Medicament;
import com.example.gestionpharmacie.services.MediBaseService;
import com.example.gestionpharmacie.services.MedicamentService;
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
public class MediBaseController {
    private MediBaseService mediBaseService;
    @RequestMapping("/ajoutMediBase")
    public String ajoutMediBase(){
        return "CreateMediBase";
    }
    @RequestMapping("newMediBase")
    public String newMediBase(@Valid MediBase medibase, BindingResult bindingResult, ModelMap modelMap){
        if(bindingResult.hasErrors()){return listemedibase(modelMap);}
        MediBase newMediBase = mediBaseService.newMediBase(medibase);
        return listemedibase(modelMap);

    }
    @RequestMapping("/listemedibase")
    public String listemedibase(ModelMap modelMap){
        List<MediBase> medibaseContr=mediBaseService.getAllMediBase();
        modelMap.addAttribute("medibaseVue",medibaseContr);
        return "ListeMediBase";
    }
    @RequestMapping("/deleteMediBase")
    public String deleteMediBase(@RequestParam("id") Long id, ModelMap modelMap){
        mediBaseService.deletMediBaseById(id);
        List<MediBase> mediBasesC=mediBaseService.getAllMediBase();
        modelMap.addAttribute("medibaseVue",mediBasesC);
        return "ListeMediBase";
    }
    @RequestMapping("/editMediBase")
    public String editMediBase(@RequestParam("id") Long id , ModelMap modelMap)
    {
        MediBase mediBaseC= mediBaseService.getMediBaseById(id);
        modelMap.addAttribute("medibaseView",mediBaseC);
        return "EditMediBase";
    }


    @RequestMapping("/updateMediBase")
    public String updateMediBase(@ModelAttribute("medibase") MediBase mediBaseC , ModelMap modelMap){
        mediBaseService.updateMediBase(mediBaseC);
        return listemedibase(modelMap);
    }
    @PostMapping("/{medibaseId}/medicaments/{medicamentId}")
    public ResponseEntity<?> addMedicamentToMediBase(@PathVariable("medibaseId") long medibaseId, @PathVariable("medicamentId") long medicamentId) {
            mediBaseService.addMedicamentToMediBase(medibaseId, medicamentId);
            return ResponseEntity.ok().build();

    }
}
