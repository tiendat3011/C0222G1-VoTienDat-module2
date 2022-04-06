package _05_access_modifier_static_method_static_property.exercise.access_modifier;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
