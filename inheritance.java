package javaone;
class calculator{
	 int num1;
	 int num2;
	public void getter(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public int add()
	{
		
		return num1+num2;
		
		
	}
	public int subtract()
	{
		return num1-num2;
		
		
	}
};
class advacalc extends calculator{
	
	public int multiply()
	{
		return num1*num2;
		
	}
	public int divide()
	{
		return num1/num2;
		
	}
	
	
};//single level 
//we can create another class here and extend it 



public class inheritance {
   public static void main(String args[])
   {
	   advacalc c=new advacalc();
	   c.getter(4, 2);
	   System.out.println(c.add());
	   System.out.println(c.subtract());
	   System.out.println(c.multiply());
	   System.out.println(c.divide());
	   
	   
	   
   }
}
