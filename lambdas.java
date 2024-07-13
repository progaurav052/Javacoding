package javaadvance;

//we make use of functional interface for lambda expression so that we can write //conscice code 
@FunctionalInterface
interface Myinterface{
	void printsomething(String message);
	//since interface i will only provide the sign not definition
}
//create a functional interface to find the sqaure of a number 
@FunctionalInterface
interface Ganith{
   int find2pow(int x);
   
}
public class lambdas {
  public static void main(String args[])
  {
	  Myinterface printing=(String message)->{System.out.println(message);};
	  
	  printing.printsomething("hi my name is gaurav");
	  
      Ganith c=(int x)->{return(x*x);};
      
      int ans=c.find2pow(2);
      System.out.println(ans);
      
     
  }
  
  //use is i need not create the class to define that abstract method
  //im using minmal line of code and doing it 
}
