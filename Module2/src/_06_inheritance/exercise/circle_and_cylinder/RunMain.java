package _06_inheritance.exercise.circle_and_cylinder;

public class RunMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, "black", 6);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());

        Circle circle = new Circle();
        System.out.println(cylinder.getArea(2));

    }
}
