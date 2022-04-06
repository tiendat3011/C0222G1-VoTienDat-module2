package _05_access_modifier_static_method_static_property.pratice.static_method;

public class StaticMethod {
    public static class Student {
        private final int rollno;
        private final String name;
        private static String college = "BBDIT";

        Student(int r, String n) {
            rollno = r;
            name = n;
        }

        static void change() {
            college = "CODEGYM";
        }

        void display() {
            System.out.println(rollno + " " + name + " " + college);
        }
    }
}