package _03_array.exercise;

import java.util.Arrays;

public class MergeArray {
    // Gộp mảng
    public static void main(String[] args) {
//     int[] array1 = {1,2,3,4,5};
//     int[] array2 = {6,7,8,9,10};
//     int[] array= new int[array1.length+array2.length];
//     System.arraycopy(array1,0,array,0,array1.length);
//     System.arraycopy(array2,0,array,array1.length,array2.length);
//        System.out.println(Arrays.toString(array));
// cach'2 gop 2 mang thu? cong
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        int[] array= new int[array1.length+array2.length];
        for (int i = 0; i < array.length; i++) {
            if (i < array1.length) {
                array[i] = array1[i];
            } else {
                array[i] = array2[i - array1.length];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
