package _06_inheritance.exercise.class_2d_and_3d;

import java.util.Arrays;

public class Class3D extends Class2D{
    private float z = 0.0f;

    public Class3D(){

    }
    public Class3D(float z){
        this.z=z;
    }
    public Class3D(float x, float y,float z){
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr2= new float[3];
        return arr2;
    }
    public void setXYZ(float x, float y, float z){
        getX();
        getY();
        getZ();
    }

    @Override
    public String toString() {
        return "Class3D{" +super.toString()+
                "z=" + z +
                '}';
    }
}
