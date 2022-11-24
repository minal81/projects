

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationS
 */
@WebServlet("/RegistrationS")
public class RegistrationS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("txtName");
		String pwd=request.getParameter("txtPWD");
		String email=request.getParameter("txtemail");
		Long phone=Long.parseLong(request.getParameter("txtphone"));
		
		PrintWriter pw=response.getWriter();
		
		
		
		//JDBC program
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minal", "root", "Minal@2000");
			Statement s=con.createStatement();
			
			
			//1.create a table
			s.execute("create table Registration(name varchar(20),password varchar(20),email varchar(20),PhoneNo int);");
			pw.write("table created");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			pw.write(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		pw.print("name:"+name+"<br></br>"+"password:"+pwd+"<br></br>"+"email:"+email+"<br></br>"+"phone no:"+phone);
	}

}
