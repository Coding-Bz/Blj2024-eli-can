import javax.swing.*;
import java.awt.*;
import java.sql.*;

import java.sql.SQLException;


public class userTable {


    public void insertuser(String UserName, String Password) {


        String sql = "INSERT INTO user(UserName, Password, Time) VALUES(?, ?, ?)";
        Connectdatabase cd=new Connectdatabase();
        JFrame frame = new JFrame("Text Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        try (Connection conn = cd.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, UserName);
            pstmt.setString(2, Password);
            pstmt.setInt(3, 0);
            pstmt.executeUpdate();
            System.out.println("Benutzer wurde gespeichert!");
            frame.dispose();
            Stop_watch framenew = new Stop_watch();
            framenew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            framenew.setSize(300, 250);
            framenew.setVisible(true);
            framenew.clockWork(UserName,Password);
        } catch (SQLException e) {
            System.out.println("Fehler beim Speichern des Benutzers"+e.getMessage());
            JOptionPane.showMessageDialog(frame,"Registration failed");
        }

    }

    public void checkExistence(String UserName, String Password) throws SQLException {
        JFrame frame = new JFrame("Text Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        Connectdatabase cd=new Connectdatabase();
        String sql = "SELECT * FROM user WHERE UserName=? AND Password=?";
        try (Connection conn = cd.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, UserName);
            pstmt.setString(2, Password);
            ResultSet re= pstmt.executeQuery();
            if (re.next()){
                System.out.println("Login erfolgreich");
                JOptionPane.showMessageDialog(frame,"Login succeful");
                frame.dispose();
                Stop_watch framenew = new Stop_watch();
                framenew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                framenew.setVisible(true);
                framenew.clockWork(UserName,Password);

            }else {
                System.out.println("Login fehlgeschlagen");

                JOptionPane.showMessageDialog(frame,"Login failed");



            }

            }
    }
}
