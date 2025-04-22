import java.sql.Connection;
import java.sql. DriverManager;
import java.sql.SQLException;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws ReachedMaxTiemException {
       Start newStart=new Start();
       End independentEnd=new End();
       DatabaseConnector dc=new DatabaseConnector();
       ConnectionProcess cp=new ConnectionProcess();



newStart.setTime(LocalTime.now());
cp.process();
System.out.println("The whole process took "+independentEnd.calculateTime(newStart.getTime()).getSeconds()+" seconds");



    }
}