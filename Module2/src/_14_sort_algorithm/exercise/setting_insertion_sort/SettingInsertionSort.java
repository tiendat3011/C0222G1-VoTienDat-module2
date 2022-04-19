package _14_sort_algorithm.exercise.setting_insertion_sort;

import java.util.Arrays;

public class SettingInsertionSort {
    //    public static void main(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            int temp = array[i];
//            int j = i - 1;
//            for (; j >  0 && array[j] > temp; j--) {
//                array[j + 1] = array[j];
//            }
//            array[j + 1] = temp;
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}
//
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 10, 3};
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
