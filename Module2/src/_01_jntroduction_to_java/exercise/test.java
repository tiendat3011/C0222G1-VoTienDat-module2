package _01_jntroduction_to_java.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class test {
    public static void main(String[] args) {
//        //tham trị
//        int a = 50;
//        add(a);
//        System.out.println(a);
//    }
//
//    static void add(int b) {
//        b = 100;
//    }
//}
//tham chiếux
        int[] a = {2, 4};
        add(a);
        System.out.println(Arrays.toString(a));
    }

    static void add(int[] x) {
        x[1] = 22;
    }
}