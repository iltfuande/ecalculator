package ua.terokhin.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ua.terokhin.demo.service.interfaces.LogarithmCalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LogarithmCalculatorServiceImplTest {

    @Autowired
    private LogarithmCalculatorService logarithmCalculatorService;

    @Test
    void testNaturalLogarithm() {
        double result = logarithmCalculatorService.naturalLogarithm(10);
        assertEquals(2.3026, result, 0.0001);
    }

    @Test
    void testBase10Logarithm() {
        double result = logarithmCalculatorService.base10Logarithm(100);
        assertEquals(2, result, 0.0001);
    }

}