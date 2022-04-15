package _11_stack_queue.exercise.check_palindrome;


import java.util.Scanner;
import java.util.Stack;

public class PalindromeQueue {
    public static void main(String[] args) {
        System.out.println("nhap chuoi");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
       String arr = "";
        while (!stack.isEmpty()){
            arr = arr+stack.pop();
        }
        System.out.println(arr);
        if (inputString.equals(arr)){
            System.out.println("dung");
        }else {
            System.out.println("sai");
        }
    }

}