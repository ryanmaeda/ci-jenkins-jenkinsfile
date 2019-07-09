package com.example.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(8, 6));
    }

}
