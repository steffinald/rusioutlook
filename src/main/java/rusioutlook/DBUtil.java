package rusioutlook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/rusioutlook"; 
    private static final String USER = "rusiuser";  
    private static final String PASSWORD = "Steffin@2005";  

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // ✅ Load driver
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL Driver not found", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
