package ua.terokhin.demo.service;

import org.springframework.stereotype.Service;
import ua.terokhin.demo.service.interfaces.LogarithmCalculatorService;

@Service
public class LogarithmCalculatorServiceImpl implements LogarithmCalculatorService {

    @Override
    public double naturalLogarithm(double number) {
        return Math.log(number);
    }

    @Override
    public double base10Logarithm(double number) {
        return Math.log10(number);
    }
}