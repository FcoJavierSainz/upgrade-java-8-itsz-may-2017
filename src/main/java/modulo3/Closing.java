package modulo3;

import java.sql.*;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class Closing {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select name from animal");
            while (rs.next())
                System.out.println(rs.getString(1));
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
            closeConnection(conn);
        }
    }
    private static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) { }
    }
    private static void closeStatement(Statement stmt) {
        try {
            if (stmt != null)
                stmt.close();
        } catch (SQLException e) { }
    }
    private static void closeConnection(Connection conn) {
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException e) { }
    }
}
