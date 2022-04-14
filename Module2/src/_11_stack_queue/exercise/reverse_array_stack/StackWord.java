package _11_stack_queue.exercise.reverse_array_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackWord {
    public static void stackWord(){
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào :");
        String str = scanner.nextLine();

        String[] arr = str.split(" ");
        for (String item: arr) {
            stack.push(item);

        }
        System.out.println("Mảng là :");
        System.out.println(stack);

        int i =0;
        while (!stack.isEmpty()){
            arr[i] = stack.pop();
            i++;
        }
        System.out.println("Đảo ngược mảng:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        stackWord();
    }


}

