package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.Personnel;
import com.example.gestionpharmacie.services.PersonnelService;
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
public class PersonnelController {
    private PersonnelService personnelService;
    @RequestMapping("/ajoutPersonnel")
    public String ajoutPersonnel(){
        return "CreatePersonnel";
    }
    @RequestMapping("newPersonnel")
    public String ajoutPersonnel(@ModelAttribute Personnel personnelC, BindingResult bindingResult, ModelMap modelMap){
        if(bindingResult.hasErrors()){return listepersonnel(modelMap);}
        Personnel newPersonnel = personnelService.Save_Personnel(personnelC);
        return listepersonnel(modelMap);

    }
    @RequestMapping("/listepersonnel")
    public String listepersonnel(ModelMap modelMap){
        List<Personnel> personnelContr=personnelService.Getallpersonnel();
        modelMap.addAttribute("personnelVue",personnelContr);
        return "ListePersonnel";

    }
    @RequestMapping("/deletePersonnel")
    public String deletePersonnel(@RequestParam("id") Long id, ModelMap modelMap){
        personnelService.Deletepersonnelbyid(id);
        List<Personnel> personnelC=personnelService.Getallpersonnel();
        modelMap.addAttribute("personnelVue",personnelC);
        return "ListePersonnel";
    }
    @RequestMapping("/editPersonnel")
    public String editPersonnel(@RequestParam("id") Long id , ModelMap modelMap)
    {
        Personnel personnelContr= personnelService.Getpersonnelbyid(id);
        modelMap.addAttribute("personnelVue",personnelContr);
        return "EditPersonnel";
    }
    @RequestMapping("/UpdatePersonnel")
    public String UpdatePersonnel(@ModelAttribute("personnel") Personnel personnelC , ModelMap modelMap){
        personnelService.Update_Personnel(personnelC);
        return listepersonnel(modelMap);
    }



}
