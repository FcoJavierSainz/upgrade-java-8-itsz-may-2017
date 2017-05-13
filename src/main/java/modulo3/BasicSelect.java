package modulo3;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JavierSainz on 5/13/17.
 */
public class BasicSelect {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url)) {
            Statement stmt = conn.createStatement();
            Map<Integer, String> idToNameMap = new HashMap<>();
            ResultSet rs = stmt.executeQuery("select id, name from species");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                idToNameMap.put(id, name);
            }
            System.out.println(idToNameMap); // {1=African Elephant, 2=Zebra}
        }

    }

}

