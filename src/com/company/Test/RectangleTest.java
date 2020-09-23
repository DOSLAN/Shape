package com.company.Test;

import com.company.Rectangle;
import com.company.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testGetters() {
        Rectangle rectangle = new Rectangle(2, 4,"Red",false);

        assertEquals(rectangle.getColor(),"Red");
        assertFalse(rectangle.isFilled());
        assertEquals(rectangle.getWidth(),2.0);
        assertEquals(rectangle.getLength(), 4.0);
        assertEquals(rectangle.getPerimeter(), 12.0);
        assertEquals(rectangle.getArea(), 8.0);
        assertEquals(rectangle.toString(), "Rectangle{width=2.0, length=4.0, color='Red', filled=false}");
    }

    @Test
    void testSetters() {
        Rectangle rectangle = new Rectangle(2, 4,"Red",false);
        rectangle.setColor("Blue");
        rectangle.setFilled(true);
        rectangle.setWidth(5);
        rectangle.setLength(6);

        assertEquals(rectangle.getColor(),"Blue");
        assertTrue(rectangle.isFilled());
        assertEquals(rectangle.getWidth(),5.0);
        assertEquals(rectangle.getLength(), 6.0);
        assertEquals(rectangle.getPerimeter(), 22.0);
        assertEquals(rectangle.getArea(), 30.0);
        assertEquals(rectangle.toString(), "Rectangle{width=5.0, length=6.0, color='Blue', filled=true}");
    }

    @Test
    void testSquare() {
        Rectangle rectangle = new Square(4,"Red",false);

        assertEquals(rectangle.getColor(),"Red");
        assertFalse(rectangle.isFilled());
        assertEquals(((Square)rectangle).getSide(), 4.0);
        assertEquals(rectangle.getWidth(),4.0);
        assertEquals(rectangle.getLength(), 4.0);
        assertEquals(rectangle.getPerimeter(), 16.0);
        assertEquals(rectangle.getArea(), 16.0);
        assertEquals(rectangle.toString(), "Square{side=4.0, color='Red', filled=false}");
    }
}