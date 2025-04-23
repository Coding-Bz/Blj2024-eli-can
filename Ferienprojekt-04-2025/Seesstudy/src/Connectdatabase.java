import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Connectdatabase {

        public Connection connect() throws SQLException {
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Blj2024-eli-can\\Ferienprojekt-04-2025\\Seesstudy\\user.db");
                return con;
        }
    }

