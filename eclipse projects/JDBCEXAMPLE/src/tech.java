import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;



public class tech
{
	public static void main(String[] args)
	{
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the student name");
			String name=sc.next();
			System.out.println("enter the student phoneno.");
			String phone=sc.next();
			
			
			
			//1.Register the MYSQL Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "Minal@2000");
			//System.out.println("Database Connected Successfully...");
			Statement s=con.createStatement();
			//s.execute("create table stud(id int auto_increment primary key,Name varchar(30) not null,phone int(20) unique)");
			//System.out.println("table created Successfully...");
			PreparedStatement ps=con.prepareStatement("insert into stud(name,phone) values(?,?);");
			ps.setString(1, name);
			ps.setString(2, phone);
			ps.executeUpdate();
			
			ResultSet rs=s.executeQuery("select name,phone from stud;");
			System.out.println("name \t\t   phone \t\t");
			System.out.println("-----------------------------------------");
			
			while(rs.next())
			{
				String na=rs.getString(1);
				String ph=rs.getString(2);
				System.out.println(na+" \t\t  "+ph);
				
			}
			
			s.close();
			con.close();
			
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
