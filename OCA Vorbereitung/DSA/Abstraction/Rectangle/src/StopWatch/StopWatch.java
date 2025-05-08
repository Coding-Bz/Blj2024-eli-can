package StopWatch;

import java.util.Date;

public class StopWatch {


    private long endTime;
    private long startTime;


    public StopWatch(){

    }
    public StopWatch(long endTime, long startTime){
        this.endTime=endTime;
        this.startTime=startTime;
    }


    public long start(){
        Date date = new Date();
        this.startTime=date.getTime();
        return startTime;

    }

    public long end(){
        Date date = new Date();
        this.endTime=date.getTime();
        return  endTime;

    }

    public long getElapsedTime(long startTime, long endTime){

        long elapsedTime=endTime-startTime;
        return elapsedTime;

    }








    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }



}
