package javaone;
class A
{
	public A()
	{
		super();//even if we dont do this it will be there
		//every class in java extends object class
		System.out.println("In A Constructor");
		
	}
	public A(int n)
	{
		super();
		
		System.out.println("in A para connstructor");
		
		
	}
	
}
class B extends A
{
	public B()
	{
		super();//even if we dont do this it will be there
		
		System.out.println("In B constructor");
		
	}
	public B(int n)
	{
		this();
		
		//super(n)
		
		System.out.println("in B para connstructor");
		
		
	}
	
}
public class thisandsuper {
	public static void main(String args[])
	{
		B obj=new B();
		B obj1=new B(2);
		
		
		
		
	}
}
