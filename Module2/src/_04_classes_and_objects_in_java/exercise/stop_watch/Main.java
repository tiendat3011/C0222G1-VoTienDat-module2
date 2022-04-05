package _04_classes_and_objects_in_java.exercise.stop_watch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Thời gian bắt đầu"+stopWatch.getStartTime());

        int[] arr = new int[10000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) Math.floor(Math.random()*10000);
        }
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    arr[j] = arr[i];
                    arr[i] = max;
                }
            }
        }
        stopWatch.stop();
        System.out.println("Thời gian kết thúc"+stopWatch.getEndTime());
        System.out.println("Mili giây : " + stopWatch.getElapsedTime());
    }
}
