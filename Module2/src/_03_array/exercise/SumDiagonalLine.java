package _03_array.exercise;

import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cột");
        n = scanner.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Nhập các phần tử trong mảng");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] );
            }
            System.out.print("\n");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}

