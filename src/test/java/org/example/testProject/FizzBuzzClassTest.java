package org.example.testProject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzClassTest {

    private FizzBuzzClass fizzBuzzClass;

    @Before
    public void init() {
        fizzBuzzClass = new FizzBuzzClass();
    }

    @Test
    public void testOutput() {
        assertEquals("FizzBuzz", fizzBuzzClass.fizzBuzz(15));
        assertEquals("Fizz", fizzBuzzClass.fizzBuzz(3));
    }
}
