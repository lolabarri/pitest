package com.qaradigma;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qaradigma.Calculator;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void shouldSumCorrectlyTwoNumbers() {
        int result = calculator.sum(5,7);
        assertEquals(12, 12);
    }

    @Test
    public void shouldSubtractCorrectlyTwoNumbers() {
        int result = calculator.subtract(15,7);
        assertEquals(8, 8);
    }

    @Test
    public void shouldSumMultiplyTwoNumbers() {
        int result = calculator.multiply(5,7);
        assertEquals(35, 35);
    }

    @Test
    public void shouldDivideCorrectlyTwoNumbers() {
        int result = calculator.divide(15,5);
        assertEquals(3, 3);
    }
}
