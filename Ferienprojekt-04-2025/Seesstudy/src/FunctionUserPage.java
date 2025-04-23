import java.sql.SQLException;
import java.util.Scanner;

public class FunctionUserPage {
    UserPage up=new UserPage();
    OptionSite os=new OptionSite();
    userTable ut=new userTable();
    Scanner scanner=new Scanner(System.in);
    public void FunctionUserPage() throws SQLException {
        int userChoice;
        System.out.println("User Choice 1 or 2");
        do {
           userChoice=scanner.nextInt();
        }while (userChoice!=1&& userChoice!=2);

        switch (userChoice){

            case 1:{
                up.setUserName();
                up.setUserPassword();
ut.checkExistence(up.getUserName(),up.getUserPassword());
break;
            }
            case 2:{
                up.setUserName();
                up.setUserPassword();
                ut.insertuser(up.getUserName(),up.getUserPassword());
            }


        }



    }



}
