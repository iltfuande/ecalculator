package ua.terokhin.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ua.terokhin.demo.service.interfaces.ScientificCalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ScientificCalculatorServiceImplTest {

    @Autowired
    private ScientificCalculatorService scientificCalculatorService;

    @Test
    void testPower() {
        double result = scientificCalculatorService.power(2, 3);
        assertEquals(8, result, 0.0001);
    }

    @Test
    void testSquareRoot() {
        double result = scientificCalculatorService.squareRoot(16);
        assertEquals(4, result, 0.0001);
    }
}