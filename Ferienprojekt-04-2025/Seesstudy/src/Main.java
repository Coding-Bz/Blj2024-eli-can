import java.sql.SQLException;
import java.time.LocalTime;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main {
    public static void main(String[] args) throws ReachedMaxTiemException, SQLException {





OptionSite os=new OptionSite();
FunctionUserPage fb=new FunctionUserPage();

os.OptionFirst();
fb.FunctionUserPageUsage();
fb.settingInfostime();








    }
}