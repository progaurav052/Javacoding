package javaadvance;

//interfaces provide total abstraction
//there are not class
//they just provide us methods
//by default public abstract 
interface Computer
{
	//i can use variables here  , but they are final and static by default 
	
	 void code();
	
}
class Laptop implements Computer
{
	public void code()
	{
		System.out.println("Code ... compile ... run .. on laptop");
	}
}
class Desktop implements Computer
{
	public void code()
	{
		System.out.println("Code ... compile ... run .. on Desktop");
	}
}
public class interfaces {
    public static void main(String args[])
    {
    	Computer l=new Laptop();
    	l.code();
    	
    	Computer d=new Desktop();
    	d.code();
    	//cannot create an object of interface 	
    	
    }
}
