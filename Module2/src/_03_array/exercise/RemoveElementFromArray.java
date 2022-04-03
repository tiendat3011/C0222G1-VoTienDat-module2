package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    //xóa phần tử khỏi mảng
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập phần tử muốn xóa ");
//        System.out.println(Arrays.toString(array));
//        int a = scanner.nextInt();
//    }
//
//    public static void xoaPt(int i, int[] arr) {
//        for (; i < arr.length; i++) {
//            if (i==arr.length - 1) {
//                arr[i]=0;
//            }else arr[i] = arr[(i+1)];
//        }
//        System.out.println(arr);
//    }
//}
public static void main(String[] args) {
    int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Scanner sc = new Scanner(System.in);
    System.out.println(Arrays.toString(array));
    System.out.println("Nhập vào phần tử muốn xóa");
    int elementX = sc.nextInt();
    boolean check = false;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == elementX) {
            System.out.println(Arrays.toString(formatArray(i, array)));
            check = true;
            break;
        }
    }
    if (!check) {
        System.out.println("Giá trị nhập vào không có trong mảng");
    }


}

    public static int[] formatArray (int i, int[] arr) {
        for (; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }
}
