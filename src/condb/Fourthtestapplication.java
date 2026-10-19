package condb;
import java.sql.*;
import java.util.*;
public class Fourthtestapplication {

			public static void main(String[] args) throws Exception {
				com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
				DriverManager.registerDriver(d);
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/query","root","root");
				if(c!=null)
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter id ");
					
					int sid=sc.nextInt();
					
					
					Statement stmt=c.createStatement();
				     int value=stmt.executeUpdate("delete from  sir where id="+sid+"");
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

