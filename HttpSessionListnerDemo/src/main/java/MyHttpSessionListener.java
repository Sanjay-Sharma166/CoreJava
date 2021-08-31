

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
   
    public void sessionCreated(HttpSessionEvent httpSessionEvent)  { 
		System.out.println("----------------");
		System.out.println("sessionCreated method has been called in" + this.getClass().getName());
		
		HttpSession session = httpSessionEvent.getSession();
		
		System.out.println(session + "Created: ");
		System.out.println("ID=" + session.getId() + "MaxInactiveInterval=" + session.getMaxInactiveInterval());
		
		System.out.println("----------------");
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent)  { 
    	System.out.println("----------------");
		System.out.println("sessionDestroyed method has been called in" + this.getClass().getName());
		
		HttpSession session = httpSessionEvent.getSession();
		
		System.out.println(session + "destroyed: ");
		System.out.println("ID=" + session.getId() + "MaxInactiveInterval=" + session.getMaxInactiveInterval());
		
		System.out.println("----------------");

    }
	
}
