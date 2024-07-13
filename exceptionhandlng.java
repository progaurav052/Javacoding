package javaadvance;
//by handling the exception we dont stop the execution 
//execution continues to happen 
public class exceptionhandlng {
 public static void main(String args[])
 {
	  int i=2;
	  int j=0;
	  int nums[]= {1,3,5};
	   
	  System.out.println("Function is about to start");
	  try 
	  {
	     j=18/i;
	     System.out.println(nums[4]);
	     
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("What is wrong ?" + e);
		  
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println("what is wrong?"+ e);
		  
	  }
	  catch(Exception e)
	  {
		  System.out.println("what is wrong ?" + e);
		  
	  }
	  
	  
	  System.out.println("Function is about end");
	  System.out.println("end");
	  
 }
}
