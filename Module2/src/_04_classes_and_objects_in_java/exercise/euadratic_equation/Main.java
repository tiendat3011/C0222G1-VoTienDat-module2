package _04_classes_and_objects_in_java.exercise.euadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a : ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: " + a + "x^2 + " + b + "x + " + c + " = 0");
        QuadraticEquation display = new QuadraticEquation(a, b, c);
        if (display.getDiscriminant() > 0) {
            System.out.println("Nghiệm 1" + display.getRoot1());
            System.out.println("Nghiệm 2" + display.getRoot2());
        }
        if (display.getDiscriminant() == 0) {
            System.out.println("Nghiệm 1" + display.getRoot1());
        } else {
            System.out.println("The equation has no root");
        }
        System.out.println(display);
    }
}
