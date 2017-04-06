package sqlbase;

import com.mysql.jdbc.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLBase {
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static Connection connection;

    public static void main(String[] args) {
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = (Connection) DriverManager.getConnection(LOGIN,PASSWORD,URL);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
