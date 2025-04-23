import java.sql.*;

public class userTable {


    public void insertuser(String UserName, String Password) {
        String sql = "INSERT INTO user(UserName, Password) VALUES(?, ?)";
        Connectdatabase cd=new Connectdatabase();
        try (Connection conn = cd.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, UserName);
            pstmt.setString(2, Password);
            pstmt.executeUpdate();
            System.out.println("Benutzer wurde gespeichert!");
        } catch (SQLException e) {
            System.out.println("Fehler beim Speichern des Benutzers"+e.getMessage());
        }
    }

    public void checkExistence(String UserName, String Password) throws SQLException {
        Connectdatabase cd=new Connectdatabase();
        String sql = "SELECT * FROM user WHERE UserName=? AND Password=?";
        try (Connection conn = cd.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, UserName);
            pstmt.setString(2, Password);
            ResultSet re= pstmt.executeQuery();
            if (re.next()){
                System.out.println("Login erfolgreich");
            }else {
                System.out.println("Login fehlgeschlagen");
            }

            }
    }
}
