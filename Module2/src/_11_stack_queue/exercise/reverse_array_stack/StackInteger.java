package _11_stack_queue.exercise.reverse_array_stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackInteger {
    public static void stackInteger() {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        for (int i = 0; i < arrayList.size(); i++) {
            stack.push(arrayList.get(i));
            arrayList.remove(arrayList.get(i));
            i--;
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        stackInteger();
    }
}



