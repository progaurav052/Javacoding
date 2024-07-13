package javaone;

abstract class vehicle
{
	public abstract void drive();
	public void playmusic()
	{
		System.out.println("starting to play music");
		
	}
}
class Wagon extends vehicle
{
	public void drive()
	{
		System.out.println("starting to drive wagonar");
		
	}
	
}
class ritz extends vehicle
{
	public void drive()
	{
		System.out.println("Starting to drive Ritz");
		
	}
}
public class abstractkeyword {
	public static void main(String args[])
	{
		//abstract class 
		//we cannot create object of this class
		//an abstractb class can have normal functions as well
		//it is not compulsory it should have a abstract function
		ritz r=new ritz();
		r.drive();
		r.playmusic();
		
		Wagon w=new Wagon();
		w.drive();
		w.playmusic();
		
		
		vehicle c=new ritz();
		c.drive();
		c.playmusic();
		
		c=w;
		c.drive();
		c.playmusic();
		
		
		
	}
}
