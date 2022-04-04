package _03_array.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddElementToArray {
    //Them phần tử vào mảng
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số cần chèn");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí");
        int index = scanner.nextInt();
        if (index <= -1 && index >= array.length - 1) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            System.out.println(Arrays.toString(formatArray(x, index, array)));

        }
    }

    public static int[] formatArray(int i, int j, int[] arr) {

        int n2 = 0;
        int n1 = arr[j];
        arr[j] = i;
        for (; j < arr.length; j++) {
            n2 = arr[j];
            arr[j] = n1;
            n1 = n2;
        }
        return arr;
    }
}
// cach 2 them vao cuoi mang
//        String[] arr = {"1", "2" , "3", "4", "5"};
//        List<String> testList = new ArrayList<>(Arrays.asList(arr));
//        System.out.println(testList);
//        testList.add("88");
//        arr = testList.toArray(new String[0]);
//        System.out.println(Arrays.toString(arr));
//    }
//}