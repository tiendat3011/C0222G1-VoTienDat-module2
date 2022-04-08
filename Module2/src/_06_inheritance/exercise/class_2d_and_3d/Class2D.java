package _06_inheritance.exercise.class_2d_and_3d;

import java.util.Arrays;

public class Class2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Class2D() {
    }

    public Class2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX(float x) {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY(float y) {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    @Override
    public String toString() {
        return "Class2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
