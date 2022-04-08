package _06_inheritance.exercise.class_2d_and_3d;

import java.util.Arrays;

public class RunMain2D3D {
    public static void main(String[] args) {
        Class2D class2D = new Class2D();
        System.out.println(class2D);
        Class2D class2D1 = new Class2D(1, 2);
        System.out.println(class2D1);

        Class3D class3D = new Class3D();
        System.out.println(class3D);
        Class3D class3D1 = new Class3D(3, 4, 5);
        System.out.println(class3D1);
    }
}
