package _01_jntroduction_to_java.exercise;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap số tiền USD muốn đổi");
        usd = scanner.nextDouble();
        double doitien = usd * vnd ;
        System.out.println("Số tiền sau khi quy đổi là: " +doitien );
    }
}
