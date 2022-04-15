package _11_stack_queue.exercise.demerging_queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static Queue<People> NU = new LinkedList<>();
    public static Queue<People> NAM = new LinkedList<>();

    public static void main(String[] args) {
        People[] people = new People[5];
        people[0] = new People("Đạt", 20, true);
        people[1] = new People("Hùng", 19,true);
        people[2] = new People("Lâm", 21,true);
        people[3] = new People("Hà", 10,false);
        people[4] = new People("Linh", 8,false);
        Arrays.sort(people);
        for (People persons : people) {
            if (persons.isGender()) {
                NAM.add(persons);
            } else {
                NU.add(persons);
            }
        }
        for (People persons : NU) {
            System.out.println(persons);
        }
        for (People persons : NAM) {
            System.out.println(persons);
        }
    }
}

