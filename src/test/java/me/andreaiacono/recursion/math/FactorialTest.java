package me.andreaiacono.recursion.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    FactorialComputer fc = new FactorialComputer();

    @Test
    void testValues() {
        assertEquals(120, fc.factorial(5));
        assertEquals(720, fc.factorial(6));
    }
}