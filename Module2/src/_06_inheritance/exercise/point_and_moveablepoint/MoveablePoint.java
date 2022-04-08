package _06_inheritance.exercise.point_and_moveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;


    public MoveablePoint() {

    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed() {

    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    public MoveablePoint move() {
        this.x += getxSpeed();
        this.y += getySpeed();
        return this;
    }

    public String toString() {
        return Arrays.toString(getXY()) + ",speed = " + Arrays.toString(getSpeed());
    }

}
