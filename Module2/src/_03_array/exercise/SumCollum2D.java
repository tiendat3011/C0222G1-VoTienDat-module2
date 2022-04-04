package _03_array.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class SumCollum2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int column;
        int row;
        System.out.println("nhập column");
        column = scanner.nextInt();
        System.out.println("nhập row ");
        row = scanner.nextInt();
        int[][] array = new int[column][row];
        System.out.println("nhập phần tử cho column và row");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("A[" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("nhập vị trí của cột muốn tính");
        int indexColumn = scanner.nextInt();
        int sum = calculateTotalColumn(indexColumn, column, array);
        System.out.println("sum: " + sum);
    }

    public static int calculateTotalColumn(int indexColumn, int column, int[][] array) {
        int sum = 0;
        for (int i = 0; i < column; i++) {
            sum += array[i][indexColumn];
        }
        return sum;
    }
}
