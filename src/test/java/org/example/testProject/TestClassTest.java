package org.example.testProject;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClassTest {

    @Test
    public void testOutput () {
        assertEquals("Hello world!", new TestClass().test("  Hello world").trim());
    }
}
