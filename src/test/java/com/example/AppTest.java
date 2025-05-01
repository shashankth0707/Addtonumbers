package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddNumbers() {
        App app = new App();

        // Test cases
        assertEquals(5, app.addNumbers(2, 3));
        assertEquals(0, app.addNumbers(-1, 1));
        assertEquals(-5, app.addNumbers(-2, -3));
    }
}

