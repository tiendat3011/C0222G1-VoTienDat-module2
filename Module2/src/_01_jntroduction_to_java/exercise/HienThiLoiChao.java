package _01_jntroduction_to_java.exercise;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name = scanner.nextLine();
        System.out.printf("Hello " + name);
    }
}