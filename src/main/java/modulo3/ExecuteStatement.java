package modulo3;

import java.sql.*;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class ExecuteStatement {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url)) {
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate("insert into species values(10, 'Deer', 3)");
            System.out.println(result);  // 1
            result = stmt.executeUpdate(
                    "update species set name = '' where name = 'None'");
            System.out.println(result); // 0
            result = stmt.executeUpdate(
                    "delete from species where id = 10");
            System.out.println(result);  // 1

        }
    }
    public void runSQL(Statement stmt, String sql) throws SQLException {
        boolean isResultSet = stmt.execute(sql);
        if (isResultSet) {
            ResultSet rs = stmt.getResultSet();
            System.out.println("ran a query");
        } else {
            int result = stmt.getUpdateCount();
            System.out.println("ran an update");
        }
    }
}
