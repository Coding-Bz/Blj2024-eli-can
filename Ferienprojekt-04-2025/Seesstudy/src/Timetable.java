import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Timetable {
    public void insertuser(String UserName, String Password, int Time) {
        System.out.println("Debug: Updating time " + Time + " for user " + UserName + " with password " + Password);

        String selectSQL = "SELECT Time FROM user WHERE UserName = ? AND Password = ?";
        String updateSQL = "UPDATE user SET Time = ? WHERE UserName = ? AND Password = ?";
        Connectdatabase cd = new Connectdatabase();

        try (Connection conn = cd.connect()) {

            // Schritt 1: Zeit abfragen
            int currentTime = 0;
            try (PreparedStatement selectStmt = conn.prepareStatement(selectSQL)) {
                selectStmt.setString(1, UserName);
                selectStmt.setString(2, Password);
                ResultSet rs = selectStmt.executeQuery();
                if (rs.next()) {
                    currentTime = rs.getInt("Time");
                }
            }


            try (PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {
                updateStmt.setInt(1, currentTime + Time/2);
                updateStmt.setString(2, UserName);
                updateStmt.setString(3, Password);
                updateStmt.executeUpdate();
            }

            System.out.println("Die Zeit wurde erfolgreich aktualisiert!");

        } catch (SQLException e) {
            System.out.println("Fehler beim Speichern: " + e.getMessage());
        }
}}
