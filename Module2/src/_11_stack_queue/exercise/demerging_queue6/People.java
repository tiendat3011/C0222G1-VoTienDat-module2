package _11_stack_queue.exercise.demerging_queue6;

public class People implements Comparable<People> {
    private String name;
    private int age;
    private boolean gender;

    public People() {
    }

    public People(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age +
                        ", gender=" + gender ;
    }

    @Override
    public int compareTo(People o) {
        if (this.age > o.age){
            return 1;
        }else if (this.age < o.age){
            return -1;
        }else {
            return 0;
        }
    }
}