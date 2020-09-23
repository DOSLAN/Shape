package com.company.Test;

import com.company.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testGetters() {
        Circle circle = new Circle(4,"Red",false);

        assertEquals(circle.getColor(),"Red");
        assertFalse(circle.isFilled());
        assertEquals(circle.getRadius(),4);
        assertEquals(circle.getPerimeter(), 25.132741228718345);
        assertEquals(circle.getArea(), 50.26548245743669);
        assertEquals(circle.toString(), "Circle{radius=4.0, color='Red', filled=false}");
    }

    @Test
    void testSetters() {
        Circle circle = new Circle(4,"Red",false);
        circle.setRadius(5);
        circle.setColor("Blue");
        circle.setFilled(true);

        assertEquals(circle.getColor(),"Blue");
        assertTrue(circle.isFilled());
        assertEquals(circle.getRadius(),5);
        assertEquals(circle.getPerimeter(), 31.41592653589793);
        assertEquals(circle.getArea(), 78.53981633974483);
        assertEquals(circle.toString(), "Circle{radius=5.0, color='Blue', filled=true}");
    }
}