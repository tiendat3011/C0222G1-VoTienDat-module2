package _01_jntroduction_to_java.exercise;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String number = "";
        String number2 = "";
        String number3 = "";
        int chuc = (a / 10) % 10;
        int donVi = a % 10;
        int tram = a / 100;

        if (a < 0) {
            System.out.println("out of ability");
        } else {
            switch (donVi) {
                case 1:
                    number = "one";
                    break;
                case 2:
                    number = "two";
                    break;
                case 3:
                    number = "three";
                    break;
                case 4:
                    number = "four";
                    break;
                case 5:
                    number = "five";
                    break;
                case 6:
                    number = "six";
                    break;
                case 7:
                    number = "seven";
                    break;
                case 8:
                    number = "eight";
                    break;
                case 9:
                    number = "nine";
                    break;
                case 0:
                    number = "";
            }
        }
        switch (tram) {
            case 1:
                number3 = "one hundred ";
                break;
            case 2:
                number3 = "two hundred ";
                break;
            case 3:
                number3 = "three hundred ";
                break;
            case 4:
                number3 = "four hundred ";
                break;
            case 5:
                number3 = "five hundred ";
                break;
            case 6:
                number3 = "six hundred ";
                break;
            case 7:
                number3 = "seven hundred ";
                break;
            case 8:
                number3 = "eight hundred ";
                break;
            case 9:
                number3 = "nine hundred ";
        }
        if (chuc == 1) {
            switch (donVi) {
                case 0:
                    number2 = "ten";
                    break;
                case 1:
                    number2 = "evelen";
                    break;
                case 2:
                    number2 = "twelve";
                    break;
                case 3:
                    number2 = "thirteen";
                    break;
                case 4:
                    number2 = "fourteen";
                    break;
                case 5:
                    number2 = "fifteen";
                    break;
                case 6:
                    number2 = "sixteen";
                    break;
                case 7:
                    number2 = "seventeen";
                    break;
                case 8:
                    number2 = "eighteen";
                    break;
                case 9:
                    number2 = "nineteen";
            }

        } else
            switch (chuc) {
                case 2:
                    number2 = "twenty ";
                    break;
                case 3:
                    number2 = "thirty ";
                    break;
                case 4:
                    number2 = "fourty ";
                    break;
                case 5:
                    number2 = "fifty ";
                    break;
                case 6:
                    number2 = "sixty ";
                    break;
                case 7:
                    number2 = "seventy ";
                    break;
                case 8:
                    number2 = "Eighty ";
                    break;
                case 9:
                    number2 = "ninety ";
            }
        if (chuc == 1 && tram == 0) {
            System.out.println(number2);
        } else if (a % 100 == 0) {
            System.out.println(number3);
        } else {
            System.out.println(number3 + "and " + number2 + number);
        }
    }
}