package lesson_13;


import com.lesson_13.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class TriangleTest {
    int a = 3;
    int b = 4;
    int c = 5;
    Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    @DisplayName("Checking that sides >0")
    public void assume() {
        assumeTrue(a > 0);
        assumeTrue(b > 0);
        assumeTrue(c > 0);
        logger.info("Checking that sides >0");
    }
    @Test
    @DisplayName("Checking the formula for the area of a triangle")

    public void areaofTriangleTest() {
        assertEquals(6.0, Triangle.areaOfTriangle(a, b, c), "area is incorrect");
        assertTrue(Triangle.isTriangle(a, b, c), "Not a triangle");
        assertFalse(!Triangle.isTriangle(a, b, c), "Not a triangle");
        assertNotNull(Triangle.areaOfTriangle(a, b, c));
        logger.info("Checking the formula for the area of a triangle");
    }
    @Test
    @DisplayName("Checking what will be an Exception in case of string input")
    void testException(){
        Assertions.assertThrows(NullPointerException.class, ()-> getException(), "no exception");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("test");
        });
        logger.info("Checking what will be an Exception in case of introducing string instead of int");
    }

    private String getException() throws NullPointerException{
        if(true) throw new NullPointerException();
        return "result";
    }
}