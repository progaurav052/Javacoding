package javaone;

class AA
{
	int a;
	
	public void show ()
	{
		System.out.println("inside class Aa");
		
	}
	
	class B
	{
		
		public void config()
		{
			System.out.println("inside inner class config");
			
		}
		
	}
}

public class innerclass {
	public static void main(String args[])
	{
		AA obj=new AA();
		obj.show();
		//not possible obj.config();
		//how to access it 
		
		//first we need the reference on left side 
		//than we need object on right side
		
		AA.B obj1=obj.new B();
		obj1.config();
		
		
		
		
		
	}

}
