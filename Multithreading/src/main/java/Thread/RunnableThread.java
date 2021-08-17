package Thread;

public class RunnableThread implements Runnable
{
	public void run()
	{
	try
	{
		System.out.println("Multithreading: Multiple threads run at same time"+Thread.currentThread().getId());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

	public static void main(String[] args)
	{
		RunnableThread r=new RunnableThread();
		Thread t = new Thread(r);
		t.start();
	
	}
	}

