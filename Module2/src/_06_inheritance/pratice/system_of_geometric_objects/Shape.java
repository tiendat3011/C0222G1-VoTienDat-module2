//package _06_inheritance.pratice.system_of_geometric_objects;
//
//public class Shape {
//    private String color = "green";
//    private boolean filled = true;
//
//    public Shape() {
//    }
//
//    public Shape(String color, boolean filled) {
//        this.color = color;
//        this.filled = filled;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public boolean isFilled() {
//        return filled;
//    }
//
//    public void setFilled(boolean filled) {
//        this.filled = filled;
//    }
//
//    @Override
//    public String toString() {
//        return "A Shape with color of "
//                + getColor()
//                + " and "
//                + (isFilled() ? "filled" : "not filled");
//    }
//    public class Circle extends Shape {
//        private double radius = 1.0;
//
//        public Circle() {
//        }
//
//        public Circle(double radius) {
//            this.radius = radius;
//        }
//
//        public Circle(double radius, String color, boolean filled) {
//            super(color, filled);
//            this.radius = radius;
//        }
//
//        public double getRadius() {
//            return radius;
//        }
//
//        public void setRadius(double radius) {
//            this.radius = radius;
//        }
//
//        public double getArea() {
//            return radius * radius * Math.PI;
//        }
//
//        public double getPerimeter() {
//            return 2 * radius * Math.PI;
//        }
//
//        @Override
//        public String toString() {
//            return "A Circle with radius="
//                    + getRadius()
//                    + ", which is a subclass of "
//                    + super.toString();
//        }
//    }
//    public class Rectangle extends Shape {
//        private double width = 1.0;
//        private double length = 1.0;
//
//        public Rectangle() {
//        }
//
//        public Rectangle(doublele width, double length) {
//            this.width = width;
//            this.length = length;
//        }
//
//        public Rectangle(double width, double length, String color, boolean filled) {
//            super(color, filled);
//            this.width = width;
//            this.length = length;
//        }
//
//        public double getWidth() {
//            return width;
//        }
//
//        public void setWidth(double width) {
//            this.width = width;
//        }
//
//        public double getLength() {
//            return length;
//        }
//
//        public void setLength(double length) {
//            this.length = length;
//        }
//
//        public double getArea() {
//            return width * this.length;
//        }
//
//        public double getPerimeter() {
//            return 2 * (width + this.length);
//        }
//
//        @Override
//        public String toString() {
//            return "A Rectangle with width="
//                    + getWidth()
//                    + " and length="
//                    + getLength()
//                    + ", which is a subclass of "
//                    + super.toString();
//        }
//    }
//    public static class Square extends Rectangle {
//        public Square() {
//        }
//
//        public Square(double side) {
//            super(side, side);
//        }
//
//        public Square(double side, String color, boolean filled) {
//            super(side, side, color, filled);
//        }
//
//        public double getSide() {
//            return getWidth();
//        }
//
//        public void setSide(double side) {
//            setWidth(side);
//            setLength(side);
//        }
//
//        @Override
//        public void setWidth(double width) {
//            setSide(width);
//        }
//
//        @Override
//        public void setLength(double length) {
//            setSide(length);
//        }
//
//        @Override
//        public String toString() {
//            return "A Square with side="
//                    + getSide()
//                    + ", which is a subclass of "
//                    + super.toString();
//        }
//    }
//}