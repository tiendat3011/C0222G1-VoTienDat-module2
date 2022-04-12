package demo_achien;

import java.util.Arrays;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[4];
        students[0] = new Student("Dat", 18, "Quang Tri", 9);
        students[1] = new Student("HHH", 16, "Quang binh", 9);
        System.out.println(Arrays.toString(students));

        for (int i = 2; i < students.length; i++) {
            if (students[i] == null) {
                System.out.println("Tên học sinh: ");
                String name = input.nextLine();

                System.out.println("Tuổi: ");
                int age = Integer.parseInt(input.nextLine());

                System.out.println("Địa chỉ: ");
                String address = input.nextLine();

                System.out.println("Điểm: ");
                int point = Integer.parseInt(input.nextLine());

                students[i] = new Student(name, age, address, point);

            }

        }

        System.out.println(Arrays.toString(students));

        System.out.println("Vị trí muốn xóa");
        int n = input.nextInt();
        students[n] = null;
        for (Student student : students) {
            if (student == null) {
                continue;

            }
            System.out.println(student.toString());
        }
    }
}