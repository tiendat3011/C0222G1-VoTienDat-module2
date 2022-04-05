package _04_ClassesAndObjectsInJava.exercise;

import java.util.Scanner;

public class StopWatch {
    public double startTime;
    public double endTime;
    public StopWatch(){

    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }
    public void start(){
        this.startTime= System.currentTimeMillis();
    }
    public void stop(){
        this.endTime=System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Thời gian bắt đầu"+stopWatch.getStartTime());
        
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) Math.floor(Math.random()*100000);
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



