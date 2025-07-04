package bank.management.system;

import java.sql.*;

public class Conn {
    //Something called jdbc connectivity
    //It has 5 steps:
    //  1. Register the driver.
    //  2. Create connection.
    //  3. Create Statement.
    //  4. Execute Query.
    //  5. Close connection.
    Connection c;
    Statement s;

    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManagementSystemDB", "root", "ssss");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
