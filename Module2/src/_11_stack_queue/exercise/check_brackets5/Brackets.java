package _11_stack_queue.exercise.check_brackets5;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        //[Optional] [Bài tập] Kiểm tra dấu ngoặc trong biểu thức sử dụng Stack
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Nhập vào biểu thức: ");
        String str = sc.nextLine();

        char arr = ' ';

        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    flag = true;
                } else {
                    arr = stack.pop();
                }
                if (arr != '(') {
                    flag = true;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
