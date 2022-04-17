package _11_stack_queue.exercise.binary_system3;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        //[Optional] [Bài tập] Chuyển đổi từ hệ thập phân sang hệ nhị phân
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