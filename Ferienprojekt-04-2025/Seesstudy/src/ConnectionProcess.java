import java.time.Duration;
import java.time.LocalTime;

public class ConnectionProcess {


    DatabaseConnector dc=new DatabaseConnector();
    Start newStart=new Start();
    End independentEnd=new End();

    public void process() throws ReachedMaxTiemException {
        newStart.setTime(LocalTime.now());
        dc.connect();
      Duration myTime=  independentEnd.calculateTime(newStart.getTime());
        if (independentEnd.calculateTime(newStart.getTime()).getSeconds()>10){
            throw new ReachedMaxTiemException("Maximum time for connecting was reached");
        }

    }



}
