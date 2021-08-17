package Thread;

public class Sleep extends Thread
{  
	 public void run()
	 {  
		  for(int i=1;i<10;i++)
		  {  
		    try
		    {
		    	Thread.sleep(100);
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    	}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
		  Sleep t1=new Sleep();  
		  t1.start();  
		
		 }  
		}  