package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.MediBase;
import com.example.gestionpharmacie.entities.Medicament;
import com.example.gestionpharmacie.entities.Pharmacie;
import com.example.gestionpharmacie.services.MediBaseService;
import com.example.gestionpharmacie.services.MedicamentService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class MedicamentController {
    private MedicamentService medicamentService;
    private MediBaseService mediBaseService;
    @RequestMapping("/ajoutMedicament")
    public String ajoutMedicament(ModelMap modelMap){
        List<MediBase> medibaseVue=mediBaseService.getAllMediBase();
        modelMap.addAttribute("medibaseVue",medibaseVue);
        return "CreateMedicament";
    }
   // @RequestMapping("newMedicament")
    //public String newMedicament(@Valid Medicament medicamentC,@RequestParam("medibase") long medibaseId,  BindingResult bindingResult, ModelMap modelMap){
      //  MediBase mediBase=mediBaseService.getMediBaseById(medibaseId);
        //if(bindingResult.hasErrors()){return listemedicaments(modelMap);}
        //Medicament newMedicament = medicamentService.newMedicament(medicamentC);
    //newMedicament.setMediBases(mediBase);
      //  medicamentService.newMedicament(newMedicament);
        //return listemedicaments(modelMap);

    //}

     @RequestMapping("newMedicament")
    public String newMedicament(@Valid Medicament medicamentC,@RequestParam("medibase") long medibaseId,  BindingResult bindingResult, ModelMap modelMap){
      MediBase mediBase=mediBaseService.getMediBaseById(medibaseId);
         if(bindingResult.hasErrors()){return listemedicaments(modelMap);}
    Medicament newMedicament =medicamentC;
         newMedicament.setMediBases(mediBase);

      medicamentService.newMedicament(newMedicament);
    return listemedicaments(modelMap);

    }




    @RequestMapping("/listemedicaments")
    public String listemedicaments(ModelMap modelMap){
        List<Medicament> medicamentsContr=medicamentService.getAllMedicament();
        modelMap.addAttribute("medicamentsVue",medicamentsContr);
        return "ListeMedicaments";

    }
    @RequestMapping("/deleteMedicament")
    public String deleteMedicament(@RequestParam("id") Long id, ModelMap modelMap){
        medicamentService.deletMedicamentById(id);
        List<Medicament> medicamentsC=medicamentService.getAllMedicament();
        modelMap.addAttribute("medicamentsVue",medicamentsC);
        return "ListeMedicaments";
    }
    @RequestMapping("/editMedicament")
    public String editMedicament(@RequestParam("id") Long id , ModelMap modelMap)
    {
        Medicament medicamentCtrl= medicamentService.getMedicamentById(id);
        modelMap.addAttribute("medicamentView",medicamentCtrl);
        List<MediBase> medibaseVue=mediBaseService.getAllMediBase();
        modelMap.addAttribute("medibaseVue",medibaseVue);
        return "EditMedicament";
    }


    @RequestMapping("/updateMedicament")
    public String updateMedicament(@ModelAttribute("medicament") Medicament medicamentC ,@RequestParam("medibase") long medibaseId, ModelMap modelMap){
        MediBase mediBase=mediBaseService.getMediBaseById(medibaseId);
        medicamentC.setMediBases(mediBase);
        medicamentService.updateMedicament(medicamentC);
        return listemedicaments(modelMap);
    }
    @PostMapping("/{medicamentId}/medi-bases/{medibaseId}")
    public ResponseEntity<?> addMediBaseToMedicament(@PathVariable("medicamentId") Long medicamentId, @PathVariable("medibaseId") Long medibaseId) {
        medicamentService.addMediBaseToMedicament(medicamentId, medibaseId);
        return ResponseEntity.ok().build();

    }
}
