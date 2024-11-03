package com.example.gestionpharmacie.Securite.Controllers;

import com.example.gestionpharmacie.Securite.Entities.User;
import com.example.gestionpharmacie.entities.Client;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @GetMapping("/accessDenied")
    public String accessDenied() {
        return "AccessDenied";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "Login";
    }

    @PostMapping("/login")
    public String login() {
        // Logique de gestion de la connexion ici
        return "redirect:/"; // Redirigez après une connexion réussie
    }
}
   /*@GetMapping("/login")
    public String login()
    {
        return "Login";
    }
    @PostMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error) {
        if (error != null) {
            // Logique de gestion de l'erreur d'authentification (par exemple, mauvais nom d'utilisateur ou mot de passe)
            // Vous pouvez transmettre un message d'erreur à la vue pour informer l'utilisateur
            return "redirect:/login?error=true"; // Redirection vers la page de connexion avec un paramètre d'erreur
        }
        return "redirect:/"; // Redirection vers la page d'accueil après une connexion réussie
    }*/

   /* @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView view = new ModelAndView();
        view.setViewName("Login");
        view.addObject("userInfo", new User());
        return view;
    }*/




/*    @PostMapping ("/login")
    public String login()/*@RequestParam(value = "error", required = false) String error, Model model*/
       /* if (error != null) {
            model.addAttribute("errorMessage", "Invalid username or password. Please try again.");
        }*/

     /*   return "Login";
    }*/

   /* @PostMapping("/login") // Ajoutez cette méthode pour gérer les soumissions de formulaire de connexion
    public String login() {
        // Logique de gestion de la connexion ici
        return "redirect:/"; // Redirigez après une connexion réussie
    }*/



