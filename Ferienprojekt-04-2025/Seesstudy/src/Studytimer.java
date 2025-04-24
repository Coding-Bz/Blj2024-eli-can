import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Studytimer {

    private LocalTime time;
    private LocalTime endTime;
private int myTime;

    public Studytimer(){

    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getMyTime() {
        Duration myTime= Duration.between(time,endTime);
        int theDuration=(int)myTime.getSeconds()/60;
        return theDuration;
    }

    public void setMyTime(LocalTime time, LocalTime endTime) {
        this.myTime= time.compareTo(endTime);
    }
}
