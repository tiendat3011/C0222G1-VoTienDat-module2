package _15_exception.exercise.illegal_triangle_exception;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Nhập cạnh a");
                int a = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập cạnh b");
                int b = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập cạnh c");
                int c = Integer.parseInt(scanner.nextLine());

                check(a,b,c);
                int sum = a + b + c;
                System.out.println("Tổng 3 cạnh của tam giác" + sum);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());;
            }
        }
    }

    public static void check(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("số vừa nhập là số âm");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("không phải 3 cạnh tam giác");
        }
    }
}
