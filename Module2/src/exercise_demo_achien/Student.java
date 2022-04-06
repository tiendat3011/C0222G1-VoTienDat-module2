package exercise_demo_achien;

public class Student {
    private String name;
    private int age;
    private String address;
    private double point ;

    Student(){

    }
    public  Student(String name, String address, int age, double point){
        this.name = name;
        this.address = address;
        this.age = age;
        this.point= point;

    }

    public Student(String name, int age, String address, int point) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }
}
