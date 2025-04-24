import java.sql.SQLException;
import java.util.Scanner;

public class FunctionUserPage {
    private final UserPage up = new UserPage();
    private final userTable ut = new userTable();
    private final optionStudy os = new optionStudy();
    Scanner scanner = new Scanner(System.in);
    private String userName;
    private String userPassword;


    private Studytimer myTimer;

    public void setStudytimer(Studytimer st) {
        this.myTimer = st;
    }

    public void FunctionUserPageUsage() throws SQLException {
        int userChoice;

        System.out.println("User Choice 1 or 2");
        do {
            userChoice = scanner.nextInt();
        } while (userChoice != 1 && userChoice != 2);

        switch (userChoice) {

            case 1: {
                up.setUserName();
                up.setUserPassword();
                userName=up.getUserName();
                userPassword=up.getUserPassword();
                ut.checkExistence(up.getUserName(), up.getUserPassword());
                System.out.println("THE INFOS: " + up.getUserName());
                System.out.println(up.getUserPassword());
                os.reDirection(this,up);

                break;
            }
            case 2: {
                up.setUserName();
                up.setUserPassword();
                userName=up.getUserName();
                userPassword=up.getUserPassword();
                System.out.println("THE INFOS: " + up.getUserName());
                System.out.println(up.getUserPassword());
                ut.insertuser(up.getUserName(), up.getUserPassword());
                os.reDirection(this,up);
            }



        }


    }
public void settingInfostime(){
    Timetable tt=new Timetable();
    tt.insertuser(userName, userPassword, myTimer.getMyTime());
}

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }
}
