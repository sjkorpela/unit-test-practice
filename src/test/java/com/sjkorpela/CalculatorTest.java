package com.sjkorpela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void ShouldAdd() {
        assertEquals(2, Calculator.add(1, 1));
    }

    @Test
    public void ShouldAddNegativeValues() {
        assertEquals(-2, Calculator.add(-1, -1));
    }

    @Test
    public void ShouldAddDecimals() {
        assertEquals(2.5, Calculator.add(1, 1.5F));
    }

    @Test
    public void ShouldAddNegativeDecimals() {
        assertEquals(-1.5, Calculator.add(1, -2.5F));
    }

}
