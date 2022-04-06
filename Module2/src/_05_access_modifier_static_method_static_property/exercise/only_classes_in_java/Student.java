package _05_access_modifier_static_method_static_property.exercise.only_classes_in_java;

public class Student {
    private String Name = "John";
    private String Classes = "CO2";

    public Student() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClasses() {
        return Classes;
    }

    public void setClasses(String classes) {
        Classes = classes;
    }
}
