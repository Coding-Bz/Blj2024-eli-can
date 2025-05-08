import java.util.Scanner;

public class Registration {

    private final UserPage up = new UserPage();
    private final userTable ut = new userTable();
    private final optionStudy os = new optionStudy();
    Scanner scanner = new Scanner(System.in);
    private String userName;
    private String userPassword;


    public void Registration(String userName, String password) {

    up.setUserName(userName);
                up.setUserPassword(password);
                System.out.println("THE INFOS: "+up.getUserName());
                System.out.println(up.getUserPassword());
                ut.insertuser(up.getUserName(),up.getUserPassword());


         //       up.setUserName(up.getUserName());
           //     up.setUserPassword(up.getUserPassword());
              //  os.reDirection(this,up);

}
}
