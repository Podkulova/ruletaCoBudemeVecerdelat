package cz.example.ruleta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class MainController {
    private final Random random = new Random();

    @GetMapping("/")
    public ModelAndView hraRuleta() {
        int selectedOptionIndex = random.nextInt(EveningOptions.values().length);
        EveningOptions selectedOption = EveningOptions.values()[selectedOptionIndex];

        ModelAndView result = new ModelAndView("ruleta");
        result.addObject("moznost", selectedOption.getDescription());
        result.addObject("index", selectedOptionIndex);
        return result;
    }
}