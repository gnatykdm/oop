package com.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TypeFromConsoleTest {
    TypeFromConsole typeFromConsole;

    @BeforeEach
    public void setUp() {
        typeFromConsole = new TypeFromConsole();
    }

    @Test
    public void typeSomethingTest() {
        typeFromConsole.typeSomething();
    }
}
