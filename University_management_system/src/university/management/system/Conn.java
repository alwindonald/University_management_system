package university.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","421121104004");
           s = c.createStatement();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
