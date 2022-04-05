package _04_classes_and_objects_in_java.exercise.stop_watch;

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

}



