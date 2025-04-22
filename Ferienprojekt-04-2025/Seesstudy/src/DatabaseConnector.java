import java.sql.Connection;
import java.sql. DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    public Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:User.db";
            conn = DriverManager.getConnection(url);
            System.out.println("No errors occured");
        } catch (SQLException e) {
            System.out.println("An error occures");
        }
        finally {
            System.out.println("Catch ended");
        }
        return conn;
    }
}