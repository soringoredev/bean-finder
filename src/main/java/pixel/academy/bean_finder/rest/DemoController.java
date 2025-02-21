package pixel.academy.bean_finder.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.spring_core_ioc_injection.Chef;

@RestController
public class DemoController {

    private Chef myChef;

    // constructor
    @Autowired
    public DemoController(Chef theChef) {
        myChef = theChef;
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }
}


