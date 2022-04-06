package _05_access_modifier_static_method_static_property.exercise.only_classes_in_java;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(" kien ngu");
        System.out.println(student.getName());
        student.setClasses("aaaa");
        System.out.println(student.getClasses());
    }
}
