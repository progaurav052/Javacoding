package javaone;

abstract class Baap{
	public abstract void show();
	
}
class Beta1 extends Baap{
	public void show()
	{
		System.out.println("I am Beta 1 of Baap");
		
	}
}
class Beta2 extends Baap{
	public void show()
	{
		System.out.println("I am Beta 2 of Baap");
		
	}
}
class Beta3 extends Baap{
	public void show()
	{
		System.out.println("I am Beta 3 of Baap");
		
	}
}
public class dynamicmethoddispatch {
	
	public static void main(String args[])
	{
		//same conecpt 
		//we can use type parent reference for calling subclass functions 
		//its depends on whose object is being refernced and not type
		//we can store object in parents refernce 
		Baap b1=new Beta1();
		b1.show();
		
		Baap b2=new Beta2();
		b2.show();
		
		Baap b3=new Beta3();
		b3.show();
		
	}
}
