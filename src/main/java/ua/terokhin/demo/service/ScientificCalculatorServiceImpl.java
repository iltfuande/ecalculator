package ua.terokhin.demo.service;

import org.springframework.stereotype.Service;
import ua.terokhin.demo.service.interfaces.ScientificCalculatorService;

@Service
public class ScientificCalculatorServiceImpl implements ScientificCalculatorService {

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}