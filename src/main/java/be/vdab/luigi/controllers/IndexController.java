package be.vdab.luigi.controllers;

import be.vdab.luigi.domain.Adres;
import be.vdab.luigi.domain.Persoon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller                             //enkel Controller bij samenwerking thymeleaf
@RequestMapping("/")                    //associatie controller met URL
class IndexController {
//    @GetMapping                         //verwerking GET requests, bij GET request oproep URL, voert method uit
//    public String index(){
//        return "index";
//    }

//    @GetMapping
//    public ModelAndView index(){
//        int uur = LocalTime.now().getHour();
//        if(uur < 12){
//            return new ModelAndView("index", "boodschap", "morgen");
//        }
//        if(uur < 18){
//            return new ModelAndView("index", "boodschap", "middag");
//        }
//        return new ModelAndView("index", "boodschap", "avond");
//    }

    private String boodschap(){
        int uur = LocalTime.now().getHour();
        if(uur < 12){
            return "morgen";
        }
        if(uur < 18){
            return "middag";
        }
        return "avond";
    }
    @GetMapping
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index", "boodschap", boodschap());
        modelAndView.addObject("zaakvoerder",
                new Persoon("Luigi","Pepperone", 7, true, LocalDate.of(1966,1,31),
                new Adres("Grote markt", "3", 9700, "Oudenaarde")));
        return modelAndView;
    }
}
