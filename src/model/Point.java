package model;
//auteur: Arnout Steffelaar

public class Point {

    public double CoordinateX;
    public double CoordinateY;

    public Point(int coordinateX, int coordinateY) {
        CoordinateX = coordinateX;
        CoordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return "(" + CoordinateX +
                "," + CoordinateY +
                ")";
    }
}
