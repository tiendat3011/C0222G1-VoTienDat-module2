package _06_inheritance.exercise.point_and_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {

    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
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
        float[] arr1 = new float[2];
        return arr1;
    }

    public MoveablePoint move() {
        super.setX(getX() + xSpeed);
        super.setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "x= " + getX() + "y= " + getY() +
                '}';
    }
}
