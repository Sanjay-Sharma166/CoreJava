

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "Log_Filter", urlPatterns = { "/Log_Filter" })
public class LogFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("----------------");
		System.out.println("init method iscalled in"+ this.getClass().getName());
		System.out.println("----------------");
		}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("doFilter method iscalled in"+ this.getClass().getName());

		PrintWriter out = res.getWriter();
		HttpServletRequest request = (HttpServletRequest) req;

		//Get the ip address
			String ipAddress = request.getRemoteAddr();
			
			//Log the IP address and current timestamp
			System.out.println("IP " + ipAddress + " , Time" + new Date().toString() +"\n\n");
			
			out.println("LogFilter is invoked before<br>");
			
			chain.doFilter(req, res);
			
			out.println("LogFilter is invoked after<br>");

	}

	
	
	public void destroy() {
		System.out.println("----------------");
		System.out.println(" destroy method is called in" + this.getClass().getName());;
		System.out.println("----------------");
	}
	
}
