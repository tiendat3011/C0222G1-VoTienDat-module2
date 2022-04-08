package _06_inheritance.exercise.point_and_moveablepoint;
import java.util.Arrays;

public class RunMainPMP {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        MoveablePoint movablePoint = new MoveablePoint(2, 3, 5, 4);
        System.out.println(movablePoint.toString() + "\n" + movablePoint.move().toString());

    }
}