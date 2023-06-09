package com.gestock.stockfb.presentation;

import com.gestock.stockfb.service.CommandeService;
import com.gestock.stockfb.service.FournitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommandeController {

    @Autowired
    private CommandeService commandeService;



    @GetMapping("/listecommande")
    public String listeCommandes(Model model){
        var commandes = commandeService.listeDesCommandes();

        model.addAttribute("commandes", commandes);

        return "listecommandes";
    }
}
