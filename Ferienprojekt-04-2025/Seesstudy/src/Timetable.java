import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Timetable {
    public void insertuser(String UserName, String Password, int Time) {
        String sql = "UPDATE user SET Time = ? WHERE UserName = ? AND Password = ?";
        Connectdatabase cd=new Connectdatabase();
        try (Connection conn = cd.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Time+Time);
            pstmt.setString(2, UserName);
            pstmt.setString(3, Password);
            pstmt.executeUpdate();

            System.out.println("Die Zeit wurde gespeichert!");
        } catch (SQLException e) {
            System.out.println("Fehler beim Speichern"+e.getMessage());
        }
    }
}
