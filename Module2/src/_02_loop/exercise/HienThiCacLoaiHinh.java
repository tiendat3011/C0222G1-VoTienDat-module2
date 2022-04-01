package _02_loop.exercise;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square top-left ");
            System.out.println("3. Draw the square botton-left");
            System.out.println("4. Draw the square top-right");
            System.out.println("5. Draw the square botton-right");
            System.out.println("6. Draw the rectangle");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                        
                    }
                    break;
                case 3:
                    for(int i=4;i>=0;i--){
                        for(int j=0;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                      
                }
                  break;
                case 4:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i ; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                    break;
                case 5:    
                for(int i=5; i>=1; i--){
                    for(int j=5; j>=i; j--){
                        System.out.print(" ");
                    }
                    for(int k=1; k<=i; k++){
                    System.out.print("*");
                    }
                    System.out.print("\n");
                }
                    break;
                case 6:
                for( int i=1 ; i<5 ; i++){
                    for(int a=5 ;a>i ; a--){
                        System.out.print(" ");
                    }
                    for(int j=1 ; j<=i*2-1; j++){
                        System.out.print("*");
                    } 
                    System.out.print("\n");
                }
            }   
        }
    }
}
