package _11_stack_queue.exercise.binary_system;

import javafx.scene.transform.Scale;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bất kì ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        String string = "";
        while (!stack.isEmpty()) {
        string += stack.pop();
        }
        System.out.println(string);
    }
}