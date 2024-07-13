package javaone;

class routine{
	public void walk()
	{
		System.out.println("go for walk");
		
	}
	//function overloading
	public void eat()
	{
		System.out.println("go for eating");
	}
	public void eat(String type)
	{
		System.out.println("go for nonveg");
		
	}
	public void sleep()
	{
		System.out.println("go for sleeping");
	}
}
public class methods {

	public static void main(String args[])
	{
		
		routine person=new routine();
		
		person.walk();
		person.eat();
		person.eat("veg");
		person.sleep();
		
		
	}
}
