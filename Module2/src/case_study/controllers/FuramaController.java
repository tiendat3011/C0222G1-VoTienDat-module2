package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1: Employee Management ");
            System.out.println("2: Customer Management ");
            System.out.println("3: Facility Management ");
            System.out.println("4: Booking Management ");
            System.out.println("5: Promotion Management ");
            System.out.println("6: Exit ");

            Scanner input = new Scanner(System.in);

            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    displayEmployee();
                    break;
                case 2:
                    displayCustomer();
                    break;
                case 3:
                    displayFacility();
                    break;
                case 4:
                    displayBooking();
                    break;
                case 5:
                    displayPromotion();
                    break;
                case 6:
                    System.exit(6);
            }
        }
    }

    public static void displayEmployee() {
        boolean check = true;
        while (check) {
            System.out.println("1: Display list employees ");
            System.out.println("2: Add new employee ");
            System.out.println("3: Edit employee ");
            System.out.println("4: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {

                }
            }
        }
    }

    public static void displayCustomer() {
        boolean check = true;
        while (check) {
            System.out.println("1: Display list customers ");
            System.out.println("2: Add new customers ");
            System.out.println("3: Edit customers ");
            System.out.println("4: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {

                }
            }
        }
    }

    public static void displayFacility() {
        boolean check = true;
        while (check) {
            System.out.println("1: Display list facility ");
            System.out.println("2: Add new facility ");
            System.out.println("3: Edit facility ");
            System.out.println("4: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {

                }
            }
        }
    }

    public static void displayBooking() {
        boolean check = true;
        while (check) {
            System.out.println("1: Add new booking ");
            System.out.println("2: Display list booking ");
            System.out.println("3: Create new constracts ");
            System.out.println("4: Display list constracts");
            System.out.println("5: Edit constracts ");
            System.out.println("6: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {

                }
            }
        }
    }

    public static void displayPromotion() {
        boolean check = true;
        while (check) {
            System.out.println("1: Display list customers use service ");
            System.out.println("2: Display list customers get voucher ");
            System.out.println("3: Return main menu ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {

                }
            }
        }
    }
}
