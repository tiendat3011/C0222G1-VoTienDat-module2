package _11_stack_queue.exercise.reverse_array_stack1;

import java.util.Stack;

public class ReverseIntegerArray {
    //    public static void stackInteger() {
//        Stack<Integer> stack = new Stack<>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//        for (int i = 0; i < arrayList.size(); i++) {
//            stack.push(arrayList.get(i));
//            arrayList.remove(arrayList.get(i));
//            i--;
//        }
//        System.out.println(stack);
//        while (!stack.isEmpty()) {
//            arrayList.add(stack.pop());
//        }
//        System.out.println(arrayList);
//    }
//
//    public static void main(String[] args) {
//        stackInteger();
//    }
//}
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Mảng số nguyên: ");
        for (Integer number : numbers) {
            System.out.printf("%d " ,number);
            //%d dùng để dịnh dạng các số nguyên, (d số nguyên, s chuỗi)
        }
        for (Integer number : numbers) {
            integerStack.push(number);
        }
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = integerStack.pop();
        }
        System.out.println();
        System.out.println("Mảng sau khi đảo ngược: ");
        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }
    }
}


