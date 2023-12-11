package ua.terokhin.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.terokhin.demo.service.interfaces.LogarithmCalculatorService;

@RestController
@RequestMapping("/api/calculator/logarithm")
public class LogarithmCalculatorController {

    private final LogarithmCalculatorService logarithmCalculatorService;

    public LogarithmCalculatorController(LogarithmCalculatorService logarithmCalculatorService) {
        this.logarithmCalculatorService = logarithmCalculatorService;
    }

    @GetMapping("/natural")
    public double naturalLogarithm(@RequestParam double number) {
        return logarithmCalculatorService.naturalLogarithm(number);
    }

    @GetMapping("/base-10")
    public double base10Logarithm(@RequestParam double number) {
        return logarithmCalculatorService.base10Logarithm(number);
    }
}