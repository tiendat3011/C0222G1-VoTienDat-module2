package _04_ClassesAndObjectsInJava.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b - 4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant()) / 2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant()) / 2 * a);
    }

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

