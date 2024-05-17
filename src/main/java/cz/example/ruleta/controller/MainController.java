package cz.example.ruleta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Random;

@Controller
public class MainController {
    private  final Random random = new Random();

    @GetMapping("/")
    public ModelAndView ruleta() {

        int selectedOptionIndex = random.nextInt(EveningOptions.values().length);

        ModelAndView result = new ModelAndView("index");
        result.addObject("ruleta", selectedOptionIndex);
        return result;

    }
}
