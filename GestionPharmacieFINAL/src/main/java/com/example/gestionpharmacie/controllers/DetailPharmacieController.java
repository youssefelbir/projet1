package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.DetailPharmacie;
import com.example.gestionpharmacie.entities.Medicament;
import com.example.gestionpharmacie.entities.Pharmacie;
import com.example.gestionpharmacie.services.DetailPharmacieService;
import com.example.gestionpharmacie.services.DetailPharmacieService;
import com.example.gestionpharmacie.services.MedicamentService;
import com.example.gestionpharmacie.services.PharmacieService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@AllArgsConstructor
public class DetailPharmacieController {
    private DetailPharmacieService detailPharmacieService;
    private MedicamentService medicamentService;
    private PharmacieService pharmacieService;
    @RequestMapping("/ajoutDetailPharmacie")
    public String ajoutDetailPharmacie(ModelMap modelMap){
        List<Medicament> medicamentsVue=medicamentService.getAllMedicament();
        modelMap.addAttribute("medicamentsVue",medicamentsVue);
        List<Pharmacie> pharmaciesVue=pharmacieService.getAllPharmacie();
        modelMap.addAttribute("pharmaciesVue",pharmaciesVue);
        return "CreateDetailPharmacie";
    }
    @RequestMapping("saveDetailPharmacie")
    public String saveDetailPharmacie(@RequestParam("quantite") double quantite,
                                      @RequestParam("medicament") long medicamentId,
                                      @RequestParam("pharmacies") long pharmacieId,
                                      ModelMap modelMap) {
        Medicament medicament = medicamentService.getMedicamentById(medicamentId);
        Pharmacie pharmacie = pharmacieService.getPharmacieById(pharmacieId);
        DetailPharmacie saveDetailPharmacie = new DetailPharmacie(quantite, medicament, pharmacie);
        detailPharmacieService.newDetailPharmacie(saveDetailPharmacie);
        return listeDetailPharmacie(modelMap);
    }


    @RequestMapping("/listeDetailPharmacie")
    public String listeDetailPharmacie(ModelMap modelMap){
        List<DetailPharmacie> detailPharmaciesC=detailPharmacieService.getAllDetailPharmacie();
        modelMap.addAttribute("detailpharmacieVue",detailPharmaciesC);
        return "DetailPharmacieList";

    }
    @RequestMapping("/deleteDetailPharmacie")
    public String deleteDetailPharmacie(@RequestParam("id") Long id, ModelMap modelMap){
        detailPharmacieService.deletDetailPharmacieById(id);
        List<DetailPharmacie> detailPharmaciesC=detailPharmacieService.getAllDetailPharmacie();
        modelMap.addAttribute("medicamentsVue",detailPharmaciesC);
        return listeDetailPharmacie(modelMap);
    }
    @RequestMapping("/editdetailpharmacie")
    public String editdetailpharmacie(@RequestParam("id") Long id , ModelMap modelMap)
    {
        DetailPharmacie detailpharmacieC= detailPharmacieService.getDetailPharmacieById(id);
        modelMap.addAttribute("detailpharmacieView",detailpharmacieC);
        return "EditDetailPharmacie";
    }


    @RequestMapping("/updateDetailPharmacie")
    public String updateDetailPharmacie(@ModelAttribute("detailpharmacie") DetailPharmacie detailPharmacieC , ModelMap modelMap){
        detailPharmacieService.updateDetailPharmacie(detailPharmacieC);
        return listeDetailPharmacie(modelMap);
    }


    /*@RequestMapping("/add")
    public String showAddDetailForm(ModelMap modelMap) {
        List<Medicament> medicamentsContr = medicamentService.getAllMedicament();
        List<Pharmacie> pharmacies = pharmacieService.getAllPharmacie();
        modelMap.addAttribute("medicamentsVue", medicamentsContr);
        modelMap.addAttribute("pharmacies", pharmacies);
        modelMap.addAttribute("detailPharmacie", new DetailPharmacie());
        return "add-detail-pharmacie";
    }

    @RequestMapping("addDetailPharmacie")
    public String addDetailPharmacie(@ModelAttribute("detailPharmacie") DetailPharmacie detailPharmacie, ModelMap modelMap) {
        DetailPharmacie newDetailPharmacie = detailPharmacieService.newDetailPharmacie(detailPharmacie);
        List<Pharmacie> pharmaciesC = pharmacieService.getAllPharmacie();
        modelMap.addAttribute("pharmacieVue2", pharmaciesC);
        return "ListePharmacies2";
    }*/

}
