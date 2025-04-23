import java.util.Scanner;

public class UserPage {

    protected String userPassword;
    protected String userName;
    Scanner scanner=new Scanner(System.in);
    protected UserPage(){
        this.userPassword="userPassword";
        this.userName="userName";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        System.out.println("What should your username be?");
        String Name=scanner.next();
        this.userName = Name;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword() {
        System.out.println("What should your Password be?");
        String Password=scanner.next();
        this.userPassword = Password;
    }
}
