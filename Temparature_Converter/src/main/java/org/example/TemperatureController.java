package org.example;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
class TemperatureController {



    @GetMapping("/convert/celsius-to-fahrenheit")
    public String celsiusToFahrenheit(@RequestParam("temp") int temp) {
        int fahrenheit = (int) (temp * (9.0 / 5) + 32);
        return temp + "°C is " + fahrenheit + "°F";
    }

    @GetMapping("/convert/fahrenheit-to-celsius")
    public String fahrenheitToCelsius(@RequestParam("temp") int temp) {
        int celsius = (temp - 32) * 5 / 9;
        return temp + "°F is " + celsius + "°C";
    }
}