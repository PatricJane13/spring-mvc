package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceIml;

@Controller
@RequestMapping("cars")
public class CarsController {

    CarServiceIml carServiceIml = new CarServiceIml();

    @RequestMapping(method = RequestMethod.GET)
    public String allCars(@RequestParam("locale") String locale, ModelMap model) {
        if (locale.equals("en")) {
            model.addAttribute("title", "CARS");
        } else if (locale.equals("ru")) {
            model.addAttribute("title", "МАШИНЫ");
        }
        model.addAttribute("messages", carServiceIml.getAllCars());
        return "cars";
    }
}
