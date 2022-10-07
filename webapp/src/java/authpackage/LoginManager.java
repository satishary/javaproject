package authpackage;

import com.sun.xml.ws.tx.at.WSATConstants;
import database.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginManager {

    public static boolean isUsernmaeAndPasswordCorrect(String username, String password) {
        try {
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from users where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }

    }
}
