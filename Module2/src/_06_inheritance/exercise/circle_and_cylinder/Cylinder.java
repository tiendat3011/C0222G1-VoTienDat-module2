package _06_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

    }
    public Cylinder(double radius,String color, double height){
       super(radius,color);
        this.height=height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea(this.getRadius())*height ;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + super.toString();
    }
}
