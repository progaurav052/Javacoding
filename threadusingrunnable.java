package javaending;
class z{
	
}
class Gmm extends z implements Runnable ///allows multiple inheritance
{
	public void run()
	{
		for(int i=0;i<50;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
				}
			catch(InterruptedException e)
			{
				System.out.println("What is Wrong ?"+ e);
				
				
			}
	        	
		}
		
	}
}
class Gnn extends z implements Runnable
{
	public void run()
	{
		for(int i=0;i<50;i++)
		{
			System.out.println("Bye");
			try {
				Thread.sleep(1000);
				}
			catch(InterruptedException e)
			{
				System.out.println("What is Wrong ?"+ e);
				
			}
			
		}
		
	}
}
public class threadusingrunnable {
	public static void main(String args[])
	{
		Gmm g1=new Gmm();
	    Gnn g2=new Gnn();
	    
	    Thread t1=new Thread(g1);//constructor takes runnable object 
	    Thread t2=new Thread(g2);
	    
	    t1.start();
	    t2.start();
	    
	    
	   
	    
	}
}
