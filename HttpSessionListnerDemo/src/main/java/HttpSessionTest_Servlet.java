

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HttpSessionTest_Servlet")
public class HttpSessionTest_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public void init(ServletConfig config) throws ServletException {
		System.out.println("----------------");
		System.out.println("init method is called in"+ this.getClass().getName());
		System.out.println("----------------");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		sleep();
		
		HttpSession httpsession = request.getSession();
		
		sleep();
		
		httpsession.invalidate();
	}
	private void sleep()
	{
		try
		{
			Thread.sleep(12000);
		}
		catch(InterruptedException e)
		{
			
		}
	}

}
