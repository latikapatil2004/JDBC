package condb;
import java.sql.*;

public class Firsttestapplication {
    public static void main(String[] args) throws Exception {
        com.mysql.cj.jdbc.Driver d =
            new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(d);
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/query","root","root");
           if(c!=null)
           {
        	   System.out.println("Database connected");
           }
           else 
           {
        	   System.out.println("Database  not connected");

           }
        

    }
}