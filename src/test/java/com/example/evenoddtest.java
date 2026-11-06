
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class evenoddtest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", evenodd.checkEvenOdd(10));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", evenodd.checkEvenOdd(7));
    }

    @Test
    void testZero() {
        assertEquals("Even", evenodd.checkEvenOdd(0));
    }

    @Test
    void testNegativeNumber() {
        assertEquals("Even", evenodd.checkEvenOdd(-4));
    }
}
