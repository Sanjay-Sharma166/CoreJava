

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("----------------");
		System.out.println("init method is called in" + this.getClass().getName());
		System.out.println("----------------");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
				chain.doFilter(request, response);
				System.out.println("doFilter method is called in" + this.getClass().getName() +"\n\n");
				
				HttpServletRequest req = (HttpServletRequest) request;
				HttpServletRequest res = (HttpServletRequest) response;

				String username = req.getParameter("username");
				String password = req.getParameter("password");
				
				if(!(username.equalsIgnoreCase("sanjay") && password.equals("sanjay")))
				{
					System.out.println("----------------");
					System.out.println("Unathorised request");
					System.out.println("----------------");
					System.out.println("index.html");
				}
				else
				{
					chain.doFilter(request, response);
				}


	}
	
	
	public void destroy() {
		System.out.println("----------------");
		System.out.println("destroy method is called in" + this.getClass().getName());;
		System.out.println("----------------");

	}
}
