package modulo3;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

class RowSetExample {
    public static void main(String[] args) {
        JdbcRowSet jdbcRS = null;
        try {
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            jdbcRS = rowSetFactory.createJdbcRowSet();
            jdbcRS.setUrl("jdbc:derby:zoo");
            jdbcRS.setCommand("SELECT * FROM animal");
            jdbcRS.execute();
            while (jdbcRS.next()) {
                System.out.print(jdbcRS.getString("name") + "-");
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                jdbcRS.close();
            } catch (SQLException e) {
            }
        }
    }
}