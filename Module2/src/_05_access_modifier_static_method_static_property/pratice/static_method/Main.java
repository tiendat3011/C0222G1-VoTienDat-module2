package _05_access_modifier_static_method_static_property.pratice.static_method;

public class Main {
        public static void main(String[] args) {
            StaticMethod.Student.change();

            StaticMethod.Student s1 = new StaticMethod.Student(111, "Hoang");
            StaticMethod.Student s2 = new StaticMethod.Student(222, "Khanh");
            StaticMethod.Student s3 = new StaticMethod.Student(333, "Nam");

            s1.display();
            s2.display();
            s3.display();
        }
    }
