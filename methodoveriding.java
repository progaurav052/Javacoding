package javaone;
//overloading in same class 
//overriding is done in different class
class Car{
	public void shiftgear()
	{
		System.out.println("gear shift of Car");
		
	}
	public void filltank()
	{
		System.out.println("filled the tank of Car");
		
	}
	public void show1()
	{
		System.out.println("in show 1");
		
	}
};
class Supercar extends Car
{
	public void shiftgear()
	{
		System.out.println("gear shift in Supercar");
		
	}
	public void filltank(int x)
	{
		System.out.println("filled tank of supercar");
		
	}
	public void show2()
	{
		System.out.println("in show 2");
		
	}
}
public class methodoveriding {
    public static void main(String args[])
    {
    	//calling using objects
    	//calling using subclass
    	//it will first search in subclass if not there go to baseclass
    	Supercar sc=new Supercar();//up casting
    	
    	sc.shiftgear();//overiding 
    	sc.filltank();//it will give an error because function name is matching in  c++ , but in java this works
    	sc.filltank(2);
    	
    	//now we will do it using pointer of base class 
    	//we know that base pointer can refer to subclass
    	//concept of virtual function
    	Car c= new Supercar();
    	c.shiftgear();
    	//here it is based on whose reference it is storing that will be called 
    	//but in c++ it has late binding and early binding
    	//late binding go on the reference 
    	//early binding go on type
    	c.show1();
    	//c.show2();
    	
    	 
    	//same error in c++ also
    	//can be solved using downcasting
    	Supercar sc1=(Supercar) c;
    	sc1.show2();
    	
    	
    	//down casting 
    	
  
    	
    	
    	
    	
    	
    }
}
