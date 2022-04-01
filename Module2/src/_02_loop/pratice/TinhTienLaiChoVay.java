package _02_loop.pratice;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        money = input.nextDouble();
        System.out.println("Nhập số tháng");
        month = input.nextInt();
        System.out.println("Nhập lãi suất ");
        interestRate = input.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interestRate / 100) / 12 * month;
        } System.out.println(total);
    }
}
