package _01_jntroduction_to_java.pratice;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println(" Nhập cân nặng của bạn: ");
        weight = scanner.nextDouble();

        System.out.println("Nhập chiều cao của bạn: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("%-20s%s"+ "bmi"+ "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
