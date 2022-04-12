package _07_abstract_class_interface.exercise.colorable;

public class RunMainColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2, "green", true);
        shapes[1] = new Square(3, "blue", false);
        shapes[2] = new Rectangle(4,2, "red", true);

        for (Shape item:shapes) {
            System.out.println(item);
            if (item instanceof Colorable){
                Colorable colorable =  (Square)item;
                colorable.howToColor();
            }
        }
    }
}

