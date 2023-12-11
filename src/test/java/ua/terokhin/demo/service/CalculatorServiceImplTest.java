package ua.terokhin.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ua.terokhin.demo.service.interfaces.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorServiceImplTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    void testAdd() {
        double result = calculatorService.add(5, 3);
        assertEquals(8, result, 0.0001);
    }

    @Test
    void testSubtract() {
        double result = calculatorService.subtract(5, 3);
        assertEquals(2, result, 0.0001);
    }

    @Test
    void testMultiply() {
        double result = calculatorService.multiply(5, 3);
        assertEquals(15, result, 0.0001);
    }

    @Test
    void testDivide() {
        double result = calculatorService.divide(6, 3);
        assertEquals(2, result, 0.0001);
    }

    @Test
    void testDivideByZero() {
        CalculatorService calculatorService = new CalculatorServiceImpl();
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(6, 0));
    }

}