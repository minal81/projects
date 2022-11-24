import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example {
	public static void main(String arg[])
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the student name");
		String name=sc.next();
		System.out.println("enter the student department");
		String dept=sc.next();*/
		
		
		try {
			//1.connect to the server
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "Minal@2000");
			Statement s=con.createStatement();
			
			//2.create table 
			//s.execute("create table student1(id int auto_increment primary key,name varchar(20) not null,dept varchar(20));");
			//System.out.println("table create....");
			
			
			//3.insert table
			/*PreparedStatement ps=con.prepareStatement("insert into student1(name,dept) values(?,?);");
			ps.setString(1, name);
			ps.setString(2, dept);
			ps.executeUpdate();*/
			
			
			//4.display table
			ResultSet rs=s.executeQuery("select id,name,dept from student1");
			System.out.println("Id \t\t name \t\t dept");
			System.out.println("----------------------------------------------------------------");
			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
