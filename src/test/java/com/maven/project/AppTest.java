package com.maven.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }
}

