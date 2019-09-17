package model;
//auteur: Arnout Steffelaar

public class Rectangle   {

    private double width;
    private double height;
    private Point point;

    public Rectangle(Point point,double width, double height)  throws IllegalArgumentException {
        if (width<0) {
            throw new IllegalArgumentException("de breedte kan niet neg. zijn.");
        }
        this.width = width;
        this.height = height;
        this.point = point;
    }

    //methoden
    public boolean containsPoint(Point point) {
        return (point.CoordinateX > this.point.CoordinateX && point.CoordinateX < this.point.CoordinateX +
                width) && (point.CoordinateY > this.point.CoordinateY - height
                && point.CoordinateY < this.point.CoordinateY) ;
    }

    public double getArea(double width, double height) {
        return width * height;
    }

    public double getCircumference(double width, double height) {
        return 2 * (width + height);
    }


    public void inflate() {
        width = 2 * width;
        height = 2 * height;
    }

    //getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Point getPoint() {
        return point;
    }
}
