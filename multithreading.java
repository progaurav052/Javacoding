package javaending;
//thread is a basic unit of process 
//thread is executed on a core 
//mainly uses the idea of time sharing 
//so it looks like threads are executing in parallel
class Gm extends Thread
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
class Gn extends Thread
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
public class multithreading {
    public static void main(String args[])
    {
    	Gm g1=new Gm();
    	
    	
    	Gn g2=new Gn();
    	
    	g1.start();//main thread executes this first 
    	try {
			Thread.sleep(10000); //to give a start delay b/w them 
			}//both thread wont execute at same time 
		catch(InterruptedException e)
		{
			System.out.println("What is Wrong ?"+ e);
			
		}
    	g2.start();//after the main thread executes g1.show() this will be executed
    	
    	
    }
}
