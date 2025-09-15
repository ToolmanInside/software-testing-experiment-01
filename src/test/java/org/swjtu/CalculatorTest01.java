package org.swjtu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest01 {

    @Test
    void testadd() {
        assertEquals(Calculator.add(1,2), 3);
    }

}
