import java.time.Duration;
import java.time.LocalTime;
import java.util.Timer;

public class End {

    public Duration calculateTime(LocalTime time){
        Duration diffrenece=Duration.between(time,LocalTime.now());
return diffrenece;
    }


}
