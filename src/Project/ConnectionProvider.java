
package Project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bmss","root","7819");
            return con;
        }
        catch(Exception e){
            return null;
            
        }
    }

    
}
