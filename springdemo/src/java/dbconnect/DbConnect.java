/*
Satish Aryan Zindabad
 */
package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.OracleDriver;

/**
 *
 * Author = Amitabh Bachchan
 */
public class DbConnect {

    public static Connection connect() {
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:xe", user = "satish", password = "pass";
            DriverManager.registerDriver(new OracleDriver());
            return DriverManager.getConnection(url, user, password);

        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }
}
