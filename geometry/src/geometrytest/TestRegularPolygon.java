package geometrytest;

import geometry.RegularPolygon;

public class TestRegularPolygon {
    public static void main(String[] args) {
        // Object 1: default polygon
        RegularPolygon p1 = new RegularPolygon();

        // Object 2: polygon with 6 sides, side length 4
        RegularPolygon p2 = new RegularPolygon(6, 4);

        // Object 3: polygon with 10 sides, side length 4, center (5.6, 7.8)
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Print results
        System.out.println("Polygon 1: Perimeter = " + p1.getPerimeter() + ", Area = " + p1.getArea());
        System.out.println("Polygon 2: Perimeter = " + p2.getPerimeter() + ", Area = " + p2.getArea());
        System.out.println("Polygon 3: Perimeter = " + p3.getPerimeter() + ", Area = " + p3.getArea());
    }
}

