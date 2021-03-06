package be.vdab.luigi.controllers;

import be.vdab.luigi.domain.Pizza;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;

@Controller
@RequestMapping("pizzas")
public class PizzaControler {
//    private final String[] pizzas = new String[]{"Prosciutto", "Margherita", "Calzone"};
    private final Pizza[] pizzas = {
            new Pizza(1, "Prosciutto", BigDecimal.valueOf(4), true),
            new Pizza(2, "Margherita", BigDecimal.valueOf(5), false),
            new Pizza(3, "Calzone", BigDecimal.valueOf(4), false),
            new Pizza(4, "Nog een lekkere njammie pizza", BigDecimal.valueOf(125.5), true)};
    @GetMapping
    public ModelAndView pizzas(){
        return new ModelAndView("pizzas", "pizzakes", pizzas);
    }
}
