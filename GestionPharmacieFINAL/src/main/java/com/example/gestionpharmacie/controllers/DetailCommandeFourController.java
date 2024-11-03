package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.CommandeFournisseur;
import com.example.gestionpharmacie.entities.DetailCommandeFour;
import com.example.gestionpharmacie.entities.Medicament;
import com.example.gestionpharmacie.services.CommandeFournisseurService;
import com.example.gestionpharmacie.services.DetailCommandeFourService;
import com.example.gestionpharmacie.services.MedicamentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class DetailCommandeFourController {
    private DetailCommandeFourService detailCommandeFourService;
    private MedicamentService medicamentService;
    private CommandeFournisseurService commandeFournisseurService;
    @RequestMapping("/ajoutDetailCommandeFour")
    public String ajoutDetailCommandeFour(ModelMap modelMap){
        List<Medicament> medicamentsVue=medicamentService.getAllMedicament();
        modelMap.addAttribute("medicamentsVue",medicamentsVue);
        List<CommandeFournisseur> commandefournisseurVue=commandeFournisseurService.Getallcommandefour();
        modelMap.addAttribute("commandefournisseurVue",commandefournisseurVue);
        return "CreateDetailCommandeFour";
    }
    @RequestMapping("/saveDetailCommandeFour")
    public String saveDetailCommandeFour(@RequestParam("Quantité") double Quantité,
                                      @RequestParam("medicament") long medicamentId,
                                      @RequestParam("commandeFournisseur") long commandeFournisseurId,
                                      ModelMap modelMap) {
        Medicament medicament = medicamentService.getMedicamentById(medicamentId);
        CommandeFournisseur commandeFournisseur = commandeFournisseurService.Getcommandefourbyid(commandeFournisseurId);
        DetailCommandeFour saveDetailCommandeFour = new DetailCommandeFour(Quantité, medicament, commandeFournisseur);
        detailCommandeFourService.Save_Detail_Comm_Four(saveDetailCommandeFour);
        return listeDetailCommandeFour(modelMap);
    }


    @RequestMapping("/listeDetailCommandeFour")
    public String listeDetailCommandeFour(ModelMap modelMap){
        List<DetailCommandeFour> detailCommandeFourC=detailCommandeFourService.Getalldetailcommfour();
        modelMap.addAttribute("detailCommandeFourVue",detailCommandeFourC);
        return "ListeDetailCommandeFour";

    }
    @RequestMapping("/deleteDetailCommandeFour")
    public String deleteDetailPharmacie(@RequestParam("id") Long id, ModelMap modelMap){
        detailCommandeFourService.Deletedetailcommfourbyid(id);
        List<DetailCommandeFour> detailCommandeFourC=detailCommandeFourService.Getalldetailcommfour();
        modelMap.addAttribute("medicamentsVue",detailCommandeFourC);
        return listeDetailCommandeFour(modelMap);
    }




}
