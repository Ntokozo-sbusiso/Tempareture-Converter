package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeController {

    @GetMapping("/")
    public String home() {
        return "index";  // This will load src/main/resources/templates/index.html
    }

    @GetMapping("/convert")
    public String convertTemperature(
            @RequestParam(name = "temp", required = false) String temp,
            @RequestParam(name = "unit", required = false) String unit,
            Model model) {

        if (temp != null && !temp.isEmpty() && unit != null) {
            try {
                double temperature = Double.parseDouble(temp);
                double convertedTemp;
                String result;

                if (unit.equals("C")) {
                    convertedTemp = (temperature * 9 / 5) + 32;
                    result = temperature + "°C is " + convertedTemp + "°F";
                } else {
                    convertedTemp = (temperature - 32) * 5 / 9;
                    result = temperature + "°F is " + convertedTemp + "°C";
                }

                model.addAttribute("result", result);
            } catch (NumberFormatException e) {
                model.addAttribute("error", "Invalid temperature value. Please enter a valid number.");
            }
        }
        return "index";
    }
}
