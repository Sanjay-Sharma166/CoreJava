package Thread;

public class Multithreading extends Thread
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
		for(int i=1;i<=8;i++)
		{
		Multithreading m=new Multithreading();
		m.start();
	}
	}

}
