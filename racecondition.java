package javaending;
//here the case is two or more people trying to execute critical condition at the same time 
class counter{
	int count;
	public counter()
	{
		count=0;
		
	}
	public synchronized 
	void  increement()
	{
		count++;
		
	}
}

class India 
extends counter implements Runnable
{
	counter c;
	public India(counter c)
	{
		this.c=c;
	}
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
		   c.increement();
		   
		}
	}
}

class china extends counter implements Runnable
{
	counter c;
	public china(counter c)
	{
		this.c=c;
	}
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
		   c.increement();
		   
		}
	}
}

public class racecondition {
	public static void main(String args[]) throws InterruptedException
	{
		counter c= new counter();
		
		India i=new India(c);
		china ch=new china(c);
		
		Thread t1=new Thread(i);
		Thread t2=new Thread(ch);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println(c.count);
		
		
		
	}
}
