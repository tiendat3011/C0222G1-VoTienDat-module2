package _14_sort_algorithm.exercise.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
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
            System.out.println(Arrays.toString(array));
        }
    }
}
