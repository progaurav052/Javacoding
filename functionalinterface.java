package javaadvance;

//annotation for  single abstract method 
@FunctionalInterface
//an interface can have variable and functions with no definitions 
///an abstract class can have functions with definitions
interface Arc{
	void show();
	//function interface is singles abstract method interface 
	//is used for lambda expression
}
class Barc implements Arc
{
	public void show()
	{
		System.out.println("in show of Barc");
		
	}
}
//here we have used Barc class only to implement the show function can we optimize it ?

public class functionalinterface {
    public static void main(String args[])
    {
    	Barc obj=new Barc();
    	obj.show();
    	
    	Arc obj1=new Barc();
    	obj1.show();
    	
    }
}
