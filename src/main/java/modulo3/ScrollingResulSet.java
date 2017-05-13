package modulo3;

import java.sql.*;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class ScrollingResulSet {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url)) {
            Statement stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("select id from species order by id");
            rs.afterLast();
            System.out.println(rs.previous());    // true
            System.out.println(rs.getInt(1));     // 2
            System.out.println(rs.previous());    // true
            System.out.println(rs.getInt(1));     // 1
            System.out.println(rs.last());        // true
            System.out.println(rs.getInt(1));     // 2
            System.out.println(rs.first());       // true
            System.out.println(rs.getInt(1));     // 1
            rs.beforeFirst();
            System.out.println(rs.getInt(1));     // throws SQLException

            /*ResultSet rs = stmt.executeQuery("select id from species where id  = -99");
            System.out.println(rs.first());  // false
            System.out.println(rs.last());   // false

           //absolute
           ResultSet rs = stmt.executeQuery("select id from animal order by id");
           System.out.println(rs.absolute(2));        // true
           System.out.println(rs.getString("id"));    // 2
           System.out.println(rs.absolute(0));        // false
           System.out.println(rs.absolute(5));        // true
           System.out.println(rs.getString("id"));    // 5
           System.out.println(rs.absolute(-2));       // true
           System.out.println(rs.getString("id"));    // 4
            

            //relative
            ResultSet rs = stmt.executeQuery("select id from animal order by id");
           System.out.println(rs.next());          // true
           System.out.println(rs.getString("id")); // 1
           System.out.println(rs.relative(2));     // true
           System.out.println(rs.getString("id")); // 3
           System.out.println(rs.relative(-1));    // true
           System.out.println(rs.getString("id")); // 2
           System.out.println(rs.relative(4));     // false
            */
        }
    }
}
