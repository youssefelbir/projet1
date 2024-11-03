package com.example.gestionpharmacie.controllers;

import com.example.gestionpharmacie.entities.Gérant;
import com.example.gestionpharmacie.services.GerantService;
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
public class GerantController {
    private GerantService gerantService;
    @RequestMapping("/ajoutGerant")
    public String ajoutGerant(){
        return "CreateGerant";
    }
    @RequestMapping("newGerant")
    public String ajoutGerant(@ModelAttribute Gérant gerantC, BindingResult bindingResult, ModelMap modelMap){
        if(bindingResult.hasErrors()){return listegerant(modelMap);}
        Gérant newGerant = gerantService.Save_Gerant(gerantC);
        return listegerant(modelMap);

    }
    @RequestMapping("/listegerant")
    public String listegerant(ModelMap modelMap){
        List<Gérant> gerantContr=gerantService.Getallgerant();
        modelMap.addAttribute("GerantVue",gerantContr);
        return "ListeGerant";

    }
    @RequestMapping("/deleteGerant")
    public String deleteGerant(@RequestParam("id") Long id, ModelMap modelMap){
        gerantService.Deletegerantlbyid(id);
        List<Gérant> gerantC=gerantService.Getallgerant();
        modelMap.addAttribute("GerantVue",gerantC);
        return "listeGerant";
    }
    @RequestMapping("/editGerant")
    public String editGerant(@RequestParam("id") Long id , ModelMap modelMap)
    {
        Gérant gerantContr= gerantService.Getgerantbyid(id);
        modelMap.addAttribute("GerantView",gerantContr);
        return "EditGerant";
    }


    @RequestMapping("/updateGerant")
    public String updateGerant(@ModelAttribute("gerant") Gérant gerantC , ModelMap modelMap){
        gerantService.Update_Gerant(gerantC);
        return listegerant(modelMap);
    }
}
