package _04_classes_and_objects_in_java.exercise.fan;

public class Fan {
    protected static final int slow = 1, medium = 2, fast = 3;
    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }


    public String getColor() {
        return color;
    }


    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public String setSpeed() {
        if (this.speed == 1) {
            return "SLOW";
        } else if (this.speed == 2) {
            return "MEDIUM";
        } else if (this.speed == 3) {
            return "FAST";
        } else {
            return "FAST";
        }
    }

    public String toString() {
        if (this.status) {
            return "speed : " + setSpeed() + "\t" + " color : " + color + "\t" + "radius : " + radius + "\t" + " fan is on";
        } else
            return " color : " + color + "\t" + "radius : " + radius + "\t" + " fan is off";

    }

}
