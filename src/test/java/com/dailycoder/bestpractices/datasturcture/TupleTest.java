package com.dailycoder.bestpractices.datasturcture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TupleTest {

    @Test
    public void testTupleCreationAndAccessors() {
        // Create a tuple with integer, string, and double elements
        Tuple<Integer, String, Double> tuple = new Tuple<>(42, "Hello, World!", 3.14);

        // Test first element
        assertEquals(42, tuple.getFirst());

        // Test second element
        assertEquals("Hello, World!", tuple.getSecond());

        // Test third element
        assertEquals(3.14, tuple.getThird(), 0.001);
    }

    @Test
    public void testTupleToString() {
        // Create a tuple with integer, string, and double elements
        Tuple<Integer, String, Double> tuple = new Tuple<>(42, "Hello, World!", 3.14);

        // Test toString method
        assertEquals("(42, Hello, World!, 3.14)", tuple.toString());
    }
}
