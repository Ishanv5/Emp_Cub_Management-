
package employee.cubicles.management.system;
import java.sql.*;
/**
 *
 * @author ishan
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
    try{
      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
     String url="jdbc:mysql://localhost:3306/ecm";
     String username="root";
     String password="";
     Connection con =DriverManager.getConnection(url,username,password);
       s=con.createStatement();
    }catch(Exception e){
      e.printStackTrace();
    }
    }
    public static void main(String args[]){
      Conn con=new Conn();
    }
}

