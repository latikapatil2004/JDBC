package condb;
import java.sql.*;
public class Secondtestapplication {

	public static void main(String[] args) throws Exception{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/query","root","root");
		if(c!=null)
		{
			System.out.println("Database is conncted");
			Statement stmt=c.createStatement();
			
			int value=stmt.executeUpdate("insert into  sir values(1,'arti',2000)");
			if(value>0)
			{
				System.out.println("Record save sucssesfully");
			}
			else
			{
				System.out.println("Record not save int database ");

			}
		}
		else
		{
			System.out.println("database not connnected");
		}
		
		}
		
	}