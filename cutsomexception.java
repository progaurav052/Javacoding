package javaadvance;
class GauravException extends Exception {
	public GauravException(String str)
	{
		super(str);
		//this is handled by the Exception class 
		
	}
}
public class cutsomexception {
	public static void main(String args[])
	{
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			if(j==0)
			{
				throw new GauravException("Gaurav is Handling the exception");
				
			}
						
			
		}
		catch (GauravException e)
		{
			System.out.println("something went wrong" + e);
		}
		catch(Exception e)
		{
			System.out.println("what is wrong?"+ e);
			
		}
		System.out.println("function ends");
		
	}

}
