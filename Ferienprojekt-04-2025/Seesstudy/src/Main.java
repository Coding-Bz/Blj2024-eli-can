import java.sql.SQLException;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws ReachedMaxTiemException, SQLException {
       Start newStart=new Start();
       End independentEnd=new End();
OptionSite os=new OptionSite();
FunctionUserPage fb=new FunctionUserPage();

os.OptionFirst();
fb.FunctionUserPage();
newStart.setTime(LocalTime.now());

System.out.println("The whole process took "+independentEnd.calculateTime(newStart.getTime()).toMillis()+" milliseconds");





    }
}