package condb;
import java.sql.*;
import java.util.*;
public class Thirdtestapplication {

	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/query","root","root");
		if(c!=null)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id name salary");
			
			int sid=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int sal=sc.nextInt();
			Statement stmt=c.createStatement();
		     int value=stmt.executeUpdate("insert into sir values("+sid+",'"+name+"',"+sal+")");
		     if(value>0)
		     {
		    	 System.out.println("Data save succefully");
		     }
		     else
		     {
		    	 System.out.println("Data nott save in dataabase");

		     }
		}
		     else
		     {
		    	 System.out.println("Database not connected ");
 
		     }
	}
	}
