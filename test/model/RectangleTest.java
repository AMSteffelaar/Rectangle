package model;

import org.junit.jupiter.api.Test;

import javax.sql.PooledConnection;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        Point point = new Point(0,0);
        Rectangle rectangle = new Rectangle(point, 2,3);
        Double expectedArea = rectangle.getWidth() * rectangle.getHeight();

    }

    @Test
    void getCircumference() {
    }

    @Test
    void getArea1() {
    }

    @Test
    void getCircumference1() {
    }

    @Test
    void inflate() {
    }
}