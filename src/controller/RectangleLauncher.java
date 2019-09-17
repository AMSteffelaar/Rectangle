package controller;
//auteur: Arnout Steffelaar

import model.Point;
import model.Rectangle;

public class RectangleLauncher {

    public static void main(String[] args) {
        Point point1 = new Point(3,4);
        Rectangle rectangle1 = new Rectangle(point1,2,4);
        Point point2 = new Point(0,0);
        Rectangle rectangle2 = new Rectangle(point2,13,9);
        Point point3 = new Point(1,4);
        Rectangle rectangle3 = new Rectangle(point3,5,8);

        System.out.printf("Een rechthoek van %1.0f bij %1.0f heeft een oppervlakte van %1.0f en een " +
                "omtrek van %1.0f.",rectangle1.getWidth(), rectangle1.getHeight() ,
                rectangle1.getArea(rectangle1.getWidth(),rectangle1.getHeight()),
                rectangle1.getCircumference(rectangle1.getWidth(),rectangle1.getHeight()));
        System.out.println();
        System.out.printf("Deze rechthoek heeft als linkerbovenhoek: (%1.0f,%1.0f)",rectangle1.getPoint().CoordinateX
        ,rectangle1.getPoint().CoordinateY);
        System.out.println();
        Point point = new Point(6,-4);
        System.out.println("Rechthoek 2 bevat het punt (6,-4): " + rectangle2.containsPoint(point));
    }




}
