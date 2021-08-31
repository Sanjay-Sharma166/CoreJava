

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 

@WebServlet("/BookLister")
public class BookLister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public BookLister() {}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();
	         
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	             
	            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","root");
	             
	            Statement statement = connect.createStatement();
	             
	            ResultSet resultSet = statement.executeQuery("select * from books");
	            out.println("<table border=\"1\">");
	            while(resultSet.next()) {
	                out.println("<tr>");
	                out.println("<td>" + resultSet.getInt("id") + "</td>");
	                out.println("<td>" + resultSet.getString("name") + "</td>");
	                out.println("<td>" + resultSet.getString("price") + "</td>");
	                out.println("</tr>");
	            }
	            out.println("</table>");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            if(out != null)
	                out.close();
	        }
	    }
	}


