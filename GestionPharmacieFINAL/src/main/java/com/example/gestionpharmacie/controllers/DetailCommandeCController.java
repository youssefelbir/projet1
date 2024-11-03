package com.example.gestionpharmacie.controllers;
import com.example.gestionpharmacie.entities.CommandeC;
import com.example.gestionpharmacie.entities.DetailCommandeC;
import com.example.gestionpharmacie.entities.Medicament;
import com.example.gestionpharmacie.services.CommandeCService;
import com.example.gestionpharmacie.services.DetailCommandeCService;
import com.example.gestionpharmacie.services.MedicamentService;
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

public class DetailCommandeCController {
    @Autowired
    private DetailCommandeCService detailCommandeCService;
    @Autowired
    private MedicamentService medicamentService;
    @Autowired

    private CommandeCService commandeCService;
    @RequestMapping("/CreateDetailCommandeC")
    public  String createDetailCommandeC(ModelMap modelmap){
        List<Medicament> medicamentsVue=medicamentService.getAllMedicament();
        modelmap.addAttribute("medicamentsVue",medicamentsVue);
        List<CommandeC> commandeCVue=commandeCService.getAllCommandeC();
        modelmap.addAttribute("commandeCVue",commandeCVue);
        return "CreateDetailCommandeC";
    }

    @RequestMapping("saveDetailCommandeC")
    public String saveDetailCommandeC(@RequestParam("Quantite")int Quantite,@RequestParam("medicaments")long id,@RequestParam("commandeC")long id2,ModelMap modelMap){
        Medicament medicament=medicamentService.getMedicamentById(id);
        CommandeC commandeC =commandeCService.getCommandeCById(id2);
        DetailCommandeC saveDetailCommandeC = new DetailCommandeC(Quantite,medicament,commandeC);
        saveDetailCommandeC.setMedicaments(medicament);
        saveDetailCommandeC.setCommandeC(commandeC);
        detailCommandeCService.saveDetailCommandeC(saveDetailCommandeC);
        return detailCommandeCList(modelMap);

    }
    @RequestMapping("/DetailCommandeCList")
    public String detailCommandeCList(ModelMap modelMap){
        List<DetailCommandeC> detailCommandeCController = detailCommandeCService.getAllDetailCommandeC();
        modelMap.addAttribute("detailCommandeCVue",detailCommandeCController);
        return "DetailCommandeCList";

    }
    @RequestMapping("/deleteDetailCommandeC")
    public String deleteDetailCommandeC(@RequestParam("id") long id ,ModelMap modelMap){
        detailCommandeCService.deleteDetailCommandeCById(id);
        List<DetailCommandeC> detailCommandeCController = detailCommandeCService.getAllDetailCommandeC();
        modelMap.addAttribute("detailCommandeCVue",detailCommandeCController);
        return "DetailCommandeCList";

    }
    @RequestMapping("/EditDetailCommandeC")
    public String editDetailCommandeC(@RequestParam("id") long id ,ModelMap modelMap){
        DetailCommandeC detailCommandeCController = detailCommandeCService.getDetailCommandeCById(id);
        modelMap.addAttribute("detailCommandeCView" , detailCommandeCController);
        return "EditDetailCommandeC";


    }
    @RequestMapping("/updateDetailCommandeC")
    public String updateDetailCommandeC(@ModelAttribute("clientVue") DetailCommandeC detailCommandeCController,ModelMap modelMap){
        detailCommandeCService.updateDetailCommandeC(detailCommandeCController);
        return detailCommandeCList(modelMap);
    }

}
