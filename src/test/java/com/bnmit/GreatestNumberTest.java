package com.bnmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreatestNumberTest {

    @Test
    void testGreatest() {
        GreatestNumber obj = new GreatestNumber();
        assertEquals(10, obj.findGreatest(10, 5));
    }
}