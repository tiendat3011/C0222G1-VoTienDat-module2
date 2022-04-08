package _07_abstract_class_interface.pratice.comparable;

public class Circle {
    private double radius;
    private String color;
    // Area dien tich

    public Circle(){

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color, boolean filled) {
    }

    public Circle(double radius) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(double radius) {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}


