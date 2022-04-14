package _11_stack_queue.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class InvertElementStack {
    public static void stackOfInteger(){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        for (int i = 0; i <arrayList.size() ; i++) {
            stack.push(arrayList.get(i));
            arrayList.remove(arrayList.get(i));
            i--;

        }

        System.out.println("Trước khi đảo ngược :");
        System.out.println(stack);
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }


        System.out.println("Sau khi đảo ngược :");
        System.out.println(arrayList);





    }
    public static void stackOfString() {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào :");
        String str = scanner.nextLine();
//         String str = "Ngày mai vẫn đến nắng vẫn ươm màu";

        String[] arr = str.split(" ");
        for (String item: arr) {
            stack.push(item);

        }
        System.out.println("Trước khi đảo ngược :");
        System.out.println(stack);

        int i =0;
        while (!stack.isEmpty()){
            arr[i] = stack.pop();
            i++;
        }
        System.out.println("Sau khi đảo ngược :");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        stackOfString();
        stackOfInteger();
    }


}
