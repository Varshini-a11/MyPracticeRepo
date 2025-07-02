package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        int result = calculator.add(2, 3);
        System.out.println("Addition Result: " + result);
        assertEquals(5, result, "2 + 3 should be 5");
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(5, 2);
        System.out.println("Subtraction Result: " + result);
        assertEquals(3, result, "5 - 2 should be 3");
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(4, 2);
        System.out.println("Multiplication Result: " + result);
        assertEquals(8, result, "4 * 2 should be 8");
    }

    @Test
    public void testDivision() {
        int result = calculator.divide(10, 2);
        System.out.println("Division Result: " + result);
        assertEquals(5, result, "10 / 2 should be 5");
    }
}
