package abc.day0103;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://47.98.146.184:3306/", "root", "abc123");
        } catch (ClassNotFoundException e) {
            System.out.println("failed to register driver.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("failed to execute sql.");
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
	
