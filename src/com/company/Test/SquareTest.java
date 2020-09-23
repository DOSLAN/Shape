package com.company.Test;

import com.company.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testGetters() {
        Square square = new Square(4,"Red",false);

        assertEquals(square.getColor(),"Red");
        assertFalse(square.isFilled());
        assertEquals(square.getSide(), 4.0);
        assertEquals(square.getPerimeter(), 16.0);
        assertEquals(square.getArea(), 16.0);
        assertEquals(square.toString(), "Square{side=4.0, color='Red', filled=false}");
    }

    @Test
    void testSetters() {
        Square square = new Square(4,"Red",false);
        square.setColor("Blue");
        square.setFilled(true);
        square.setSide(5);

        assertEquals(square.getColor(),"Blue");
        assertTrue(square.isFilled());
        assertEquals(square.getSide(), 5.0);
        assertEquals(square.getPerimeter(), 20.0);
        assertEquals(square.getArea(), 25.0);
        assertEquals(square.toString(), "Square{side=5.0, color='Blue', filled=true}");
    }
}