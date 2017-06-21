package com.example.calc;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalcController {

    @GetMapping("/")
    public String calc(Model model){
        model.addAttribute("calc", new Calc());
        return "calc";
    }

    @PostMapping("/plus")
    public String calcPlus(@ModelAttribute Calc calc){
        calc.setRes(calc.getFirstValue() + calc.getSecondValue());
        return "res";
    }
}
