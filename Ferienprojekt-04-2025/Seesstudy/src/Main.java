import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws ReachedMaxTiemException, SQLException {

OptionSite os=new OptionSite();
FunctionUserPage fb=new FunctionUserPage();
os.OptionFirst();
fb.FunctionUserPageUsage();
fb.settingInfostime();


    }
}