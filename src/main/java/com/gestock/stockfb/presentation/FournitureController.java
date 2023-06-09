package com.gestock.stockfb.presentation;

import com.gestock.stockfb.service.FournitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FournitureController {

    @Autowired
    private FournitureService fournitureService;

    @GetMapping("/accueil")
    public String accueil(Model model){

        return "accueil";
    }

    @GetMapping("/listefourniture")
    public String listeFournitures(Model model){
        var fournitures = fournitureService.listeDesFournitures();

        System.err.println("Test");
        model.addAttribute("fournitures", fournitures);

        return "listefournitures";
    }
}
