package ua.terokhin.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.terokhin.demo.service.interfaces.ScientificCalculatorService;

@RestController
@RequestMapping("/api/calculator/scientific")
public class ScientificCalculatorController {

    private final ScientificCalculatorService scientificCalculatorService;

    public ScientificCalculatorController(ScientificCalculatorService scientificCalculatorService) {
        this.scientificCalculatorService = scientificCalculatorService;
    }

    @GetMapping("/power")
    public double power(@RequestParam double base, @RequestParam double exponent) {
        return scientificCalculatorService.power(base, exponent);
    }

    @GetMapping("/square-root")
    public double squareRoot(@RequestParam double number) {
        return scientificCalculatorService.squareRoot(number);
    }
}