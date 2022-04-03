package _03_array.exercise;

import java.util.Scanner;

public class MaximumValueIn2dArray {
    // phần tử lớn nhất trong mảng 2 chiều
    public static void main(String[] args) {
        int m;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        m = scanner.nextInt();
        System.out.println("Nhập số cột");
        n = scanner.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Nhập các phần tử trong mảng");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng 2 chiều là: " + max);
    }
}
