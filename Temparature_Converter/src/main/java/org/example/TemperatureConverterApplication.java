package org.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TemperatureConverterApplication {
    public static void main(String[] args) {
        SpringApplication.run(TemperatureConverterApplication.class, args);

    }
}
