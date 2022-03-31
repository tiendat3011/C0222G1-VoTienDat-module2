package _01_jntroduction_to_java.pratice;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float with, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        with = scanner.nextFloat();
        System.out.println("nhap chieu rong");
        height = scanner.nextFloat();
        float S = with * height ;
        System.out.println("Diện tích hình chữ nhật là" +S);
    }
}
