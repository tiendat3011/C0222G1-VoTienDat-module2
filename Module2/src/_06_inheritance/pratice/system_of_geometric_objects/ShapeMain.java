//package _06_inheritance.pratice.system_of_geometric_objects;
//
//import _05_access_modifier_static_method_static_property.exercise.access_modifier.Circle;
//
//import java.awt.*;
//
//public class ShapeMain {
//    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//
//        System.out.println(circle);
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
//        Shape.Square square = new Shape.Square();
//        System.out.println(square);
//
//        square = new Shape.Square(2.3);
//        System.out.println(square);
//
//        square = new Shape.Square(5.8, "yellow", true);
//        System.out.println(square);
//    }
//
//
//}