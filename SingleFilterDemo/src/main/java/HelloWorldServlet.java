

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void init(ServletConfig config) throws ServletException {
		System.out.println("----------------");
		System.out.println("Init method is called in" + this.getClass().getName());
		System.out.println("----------------");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet method is called in" + this.getClass().getName() +"\n\n");
		System.out.println("----------------");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Hello World !!<br>");
	}

	
	
	
	public void destroy() {
		System.out.println("----------------");
		System.out.println("destroy method is called in" + this.getClass().getName() +"\n\n");
		System.out.println("----------------");

	}
	
}
