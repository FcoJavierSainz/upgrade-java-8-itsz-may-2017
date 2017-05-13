package modulo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class ExecutePreparedStatement {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url)) {
            PreparedStatement ps = conn.prepareStatement("delete from animal where name = ?");
            ps.setString(1, "name with'single quote");
            ps.execute();
        }
    }
}
