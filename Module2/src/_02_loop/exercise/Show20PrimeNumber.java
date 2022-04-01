package _02_loop.exercise;

import java.util.Scanner;

public class Show20PrimeNumber {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Nhập lượng số nguyên");
      int number = scanner.nextInt();
      int count = 0;
      int n = 2;
      
      while (count < number) {
         int a= 0;
         for (int i = 2; i < n; i++) {
            if (n % i == 0) {
               a++;              
            }
         }
         if (a==0) {
            System.out.println(n);
            count++;
         }
         n++;
      }
   }
}
