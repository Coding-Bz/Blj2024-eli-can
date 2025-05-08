import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class Firstpage {

    private ArrayList<String>userInformations;
    ArrayList<String>userInformation=new ArrayList<>();

    public  ArrayList informationTake() {


        Login lg = new Login();
        Registration rg = new Registration();


        JFrame frame = new JFrame("Text Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        JLabel username = new JLabel("Enter your Username:");
        JLabel password = new JLabel("Enter your Password:");

        JTextField usernameField = new JTextField(15);
        JTextField passwordField = new JTextField(15);

        JButton loginButton = new JButton("Login");
        JButton registrationButton = new JButton("Register");


        registrationButton.addActionListener(e -> {
            String inputUsername = usernameField.getText();
            String inputPassword = passwordField.getText();
            rg.Registration(inputUsername, inputPassword);

            frame.dispose(); //TEST
            //ÖNEMLI
        });


        loginButton.addActionListener(e -> {
            String inputUsername = usernameField.getText();
            String inputPassword = passwordField.getText();

            userInformation.add(inputUsername);
            userInformation.add(inputPassword);
            System.out.println("WICHTIG :  " + userInformation.get(0) + userInformation.get(1));

            frame.dispose(); //TEST


            //ÖNEMLI


            try {
                lg.Login(inputUsername, inputPassword);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }


        });


        panel.add(username);
        panel.add(usernameField);
        panel.add(password);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registrationButton);

        frame.add(panel);
        frame.setVisible(true);

        return userInformation;
    }


}

