package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testCalculateSimpleInterest() {
        App app = new App();
        // Principal=10000, Rate=5%, Time=2 years -> Interest should be 1000.0
        assertEquals(1000.0, app.calculateSimpleInterest(10000, 5, 2), 0.001);
    }

    @Test
    public void testZeroInterest() {
        App app = new App();
        assertEquals(0.0, app.calculateSimpleInterest(0, 7.5, 3), 0.001);
        assertEquals(0.0, app.calculateSimpleInterest(5000, 0, 4), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInputs() {
        App app = new App();
        app.calculateSimpleInterest(-1000, 5, 2);
    }
}
