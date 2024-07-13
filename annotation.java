package javaadvance;

//supplying extra info to the compiler
class A
{
	public void show()
	{
		System.out.println("in show A");
		
	}
}
class B extends A
{
	@Override //showing this intention to the compiler
	public void show()
	{
		System.out.println("in show B");
		
	}
}
public class annotation {
  public static void main(String args[])
  {
	  B obj=new B();
	  obj.show();
	  
	  A obj1=new B();
	  obj1.show();
	  
	  
  }
		
}
