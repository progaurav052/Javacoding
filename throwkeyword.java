package javaadvance;

public class throwkeyword {

	public static void main(String args[])
	{
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			if(j==0)
			{
				//can be used in case of database or we want to handle the Exception Explicitly
				throw new ArithmeticException("cant get 0 as quotient");
				
			}
						
			
		}
		catch(Exception e)
		{
			System.out.println("what is wrong?"+ e);
			
		}
		System.out.println("function ends");
		
	}
}
