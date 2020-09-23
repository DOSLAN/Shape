package com.company.Test;

import com.company.Circle;
import com.company.Rectangle;
import com.company.Shape;
import com.company.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ShapeTest {
    @Test
    void testCircle() {
        Shape shape = new Circle(4, "Red", false);

        assertEquals(shape.getColor(), "Red");
        assertFalse(shape.isFilled());
        assertEquals(shape.getPerimeter(), 25.132741228718345);
        assertEquals(shape.getArea(), 50.26548245743669);
        assertEquals(((Circle) shape).getRadius(), 4);
        assertEquals(shape.toString(), "Circle{radius=4.0, color='Red', filled=false}");
    }


    @Test
    void testRectangle() {
        Shape shape = new Rectangle(2, 4,"Red",false);

        assertEquals(shape.getColor(),"Red");
        assertFalse(shape.isFilled());
        assertEquals(((Rectangle)shape).getWidth(),2.0);
        assertEquals(((Rectangle)shape).getLength(), 4.0);
        assertEquals(shape.getPerimeter(), 12.0);
        assertEquals(shape.getArea(), 8.0);
        assertEquals(shape.toString(), "Rectangle{width=2.0, length=4.0, color='Red', filled=false}");
    }

    @Test
    void testSquare() {
        Shape shape = new Square(4,"Red",false);

        assertEquals(shape.getColor(),"Red");
        assertFalse(shape.isFilled());
        assertEquals(((Square)shape).getSide(), 4.0);
        assertEquals(shape.getPerimeter(), 16.0);
        assertEquals(shape.getArea(), 16.0);
        assertEquals(shape.toString(), "Square{side=4.0, color='Red', filled=false}");
    }


}