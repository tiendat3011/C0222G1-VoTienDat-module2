package _04_classes_and_objects_in_java.exercise.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 3, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
