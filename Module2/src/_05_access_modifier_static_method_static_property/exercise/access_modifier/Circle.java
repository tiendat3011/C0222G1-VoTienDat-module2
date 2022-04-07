package _05_access_modifier_static_method_static_property.exercise.access_modifier;

public class Circle {
    private double Radius = 1.0;
    private String Color = "red";
    private double Area;

    public Circle(double Radius) {
        this.Radius = Radius;
    }

    public Circle() {

    }

    public Circle(double v, String indigo, boolean b) {
    }

    public double getRadius() {

        return Radius;
    }

    public double getArea() {
        double Area = Math.PI * Math.pow(this.Radius, 2);
        return Area;
    }
}
