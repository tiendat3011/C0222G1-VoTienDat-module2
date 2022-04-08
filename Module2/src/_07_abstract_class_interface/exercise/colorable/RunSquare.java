package _07_abstract_class_interface.exercise.colorable;

public class RunSquare {
    public static void main(String[] args) {
        Square square= new Square(9,"red",true);
        square.howToColor();
        System.out.println(square);
    }
}