package _03_array.exercise;

import java.util.Scanner;

public class CountNumberCharacterAppearsInString {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi bất kỳ: ");
        String string = sc.nextLine();
        System.out.println("Nhập kí tự cần tìm trong chuỗi: " + string);
        char x = sc.nextLine().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == x) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Kí tự " + x + " không có trong chuỗi");
        } else {
            System.out.println("Kí tự " + x + " xuất hiện " + count + " lần trong chuỗi");
        }
    }
}

