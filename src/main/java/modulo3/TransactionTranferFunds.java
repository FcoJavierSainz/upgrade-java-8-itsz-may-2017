package modulo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class TransactionTranferFunds {
    public static void main(String[] args) {
        Connection con = null;
        Statement statement = null;
        try {
            con = getConnection();
            con.setAutoCommit(false);
            statement = con.createStatement();


            System.out.println(statement.executeUpdate("INSERT INTO animal VALUES (8, 1, 'Javier 2', '2010-06-08 01:24:00')"));
            System.out.println(statement.executeUpdate("INSERT INTO animal VALUES (7, 2, 'Francisco', '2005-11-12 03:44:00')"));
            con.commit();
        } catch (SQLException e) {
            System.out.println(e);
            try {
                con.rollback();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    static Connection getConnection() throws SQLException {
        // code to create and return Connection object
        String url = "jdbc:derby:zoo";
        return DriverManager.getConnection(url);
    }
}