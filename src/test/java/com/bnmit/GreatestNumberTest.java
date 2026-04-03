package com.bnmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreatestNumberTest {

    @Test
    void testGreatest() {
        GreatestNumber obj = new GreatestNumber();
        assertEquals(5, obj.findGreatest(5, 10));
    }
}
