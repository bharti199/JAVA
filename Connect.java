package bank.management.system;
import java.sql.*;

public class Connect {
    Connection c;
    Statement s;
    public Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Bharti@123");
            s = c.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
