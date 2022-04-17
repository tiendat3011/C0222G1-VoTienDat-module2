package _11_stack_queue.exercise.reverse_array_stack1;

import java.util.Stack;

public class ReverseWordArray {
    public static void stackWord(){
        Stack<Character> characters = new Stack<>();
        String string = "abcdef";
        System.out.println("Chuỗi: ");
        System.out.println(string);
        for (Character ch : string.toCharArray()) {
            characters.push(ch);
        }
        System.out.println("Đảo ngược chuỗi: ");
        for (int index = 0; index < string.length(); index++) {
            System.out.print(characters.pop());
        }
    }
}
