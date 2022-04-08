package _06_inheritance.exercise.point_and_moveablepoint;

public class RunMainPMP {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        Point point1 = new Point(2.0f, 5.0f);
        System.out.println(point1);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        MoveablePoint movablePoint1 = new MoveablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println(movablePoint1);
        System.out.println(movablePoint1.move());
    }
}
