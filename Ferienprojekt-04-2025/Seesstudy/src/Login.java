import java.sql.SQLException;
import java.util.Scanner;

public class Login {

    private final UserPage up = new UserPage();
    private final userTable ut = new userTable();
    private final optionStudy os = new optionStudy();
    Scanner scanner = new Scanner(System.in);
    private String userName;
    private String userPassword;

    public  void Login(String userName, String password) throws SQLException {

        up.setUserName(userName);
        up.setUserPassword(password);
        userName=up.getUserName();
        userPassword=up.getUserPassword();
        ut.checkExistence(up.getUserName(), up.getUserPassword());
        System.out.println("THE INFOS: " + up.getUserName());
        System.out.println(up.getUserPassword());
       // os.reDirection(this,up);


    }





}
