package _11_stack_queue.exercise.demerging_queue6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    //[Optional] [Bài tập] Tổ chức dữ liệu hợp lý - Demerging sử dụng Queue
    public static Queue<People> queueMale = new LinkedList<>();
    public static Queue<People> queueFemale = new LinkedList<>();

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
                queueMale.add(persons);
            } else {
                queueFemale.add(persons);
            }
        }
        for (People persons : queueFemale) {
            System.out.println(persons);
        }
        for (People persons : queueMale) {
            System.out.println(persons);
        }
    }
}

