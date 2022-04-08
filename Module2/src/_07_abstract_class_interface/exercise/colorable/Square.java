package _07_abstract_class_interface.exercise.colorable;

public class Square extends Shape implements Colorable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }


    @Override
    public String toString() {
        return "square with side " + side + ", Area is " + getArea() + ", " + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("tô hình tròn");
    }

}

