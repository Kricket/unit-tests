package com.ineat.academy.unittests.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void add_works_for_2_and_5() {
        final int sum = calculator.add(2, 5);
        assertEquals(7, sum);
    }
}
