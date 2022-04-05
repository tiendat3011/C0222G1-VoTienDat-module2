package _04_ClassesAndObjectsInJava.exercise;

import java.util.Arrays;

public class Fan {

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
        public static void main(String[] args) {
            Fan fan1 = new Fan(3, true, 10, "yellow");
            Fan fan2 = new Fan(2, false, 5, "blue");
            System.out.println(fan1.toString());
            System.out.println(fan2.toString());
        }
    }
