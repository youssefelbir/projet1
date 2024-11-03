package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.Employé;
import com.example.gestionpharmacie.entities.Medicament;
import com.example.gestionpharmacie.entities.Pharmacie;
import com.example.gestionpharmacie.services.EmployéService;
import com.example.gestionpharmacie.services.MedicamentService;
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
public class EmployeController {
    private EmployéService employéService;
    @RequestMapping("/ajoutEmploye")
    public String ajoutEmploye(){
        return "CreateEmploye";
    }
    @RequestMapping("newEmploye")
    public String newEmploye(@Valid Employé employéC, BindingResult bindingResult, ModelMap modelMap){
        if(bindingResult.hasErrors()){return listeemployes(modelMap);}
        Employé newEmployé = employéService.newEmployé(employéC);
        return listeemployes(modelMap);

    }
    @RequestMapping("/listeemployes")
    public String listeemployes(ModelMap modelMap){
        List<Employé> employesContr=employéService.getAllEmployé();
        modelMap.addAttribute("employeVue",employesContr);
        return "ListeEmployes";

    }
    @RequestMapping("/deleteEmploye")
    public String deleteEmploye(@RequestParam("id") Long id, ModelMap modelMap){
        employéService.deletEmployéById(id);
        List<Employé> employésC=employéService.getAllEmployé();
        modelMap.addAttribute("employeVue",employésC);
        return "ListeEmployes";
    }
    @RequestMapping("/editEmploye")
    public String editEmploye(@RequestParam("id") Long id , ModelMap modelMap)
    {
        Employé employéCtrl= employéService.getEmployéById(id);
        modelMap.addAttribute("employeView",employéCtrl);
        return "EditEmploye";
    }


    @RequestMapping("/updateEmploye")
    public String updateEmploye(@ModelAttribute("employe") Employé employéC , ModelMap modelMap){
        employéService.updateEmployé(employéC);
        return listeemployes(modelMap);
    }
}
