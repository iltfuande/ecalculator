package ua.terokhin.demo.service;

import org.springframework.stereotype.Service;
import ua.terokhin.demo.service.interfaces.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("You cannot divide by zero");
        }
    }
}