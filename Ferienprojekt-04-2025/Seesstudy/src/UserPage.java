import java.util.Scanner;

public class UserPage {

    private String userPassword;
    private String userName;
    Scanner scanner = new Scanner(System.in);

    public UserPage(){
        this.userPassword="";
        this.userName="";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String Name) {
        //System.out.println("What should your username be?");
        //String Name=scanner.next();
        this.userName = Name;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String Password) {
    //    System.out.println("What should your Password be?");
      //  String Password=scanner.next();
        this.userPassword = Password;
    }
}
