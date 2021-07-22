package electricity.billing.system;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/electricity","root","");
            s = c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
