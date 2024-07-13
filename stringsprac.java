package javaone;

public class stringsprac {
   public static void main(String args[])
   {
	   //String is actually is class
	   // no we can't use [] for string
	   /*String name="gaurav";//not a good way for java
	   System.out.print(name);
	   String surname= new String("Pai");//since it is class more better way
	  
	  //string concatenation 
	  System.out.println("hello" + name + surname );
	  System.out.println(name.concat(surname));
	  //strings are immutable in java and python
	  
	  //every string that u create in java is allocated memory in string pool
	  //which is constant
	  String s1="gaurav";
	  String s2="gaurav";
	  if(s1==s2)
	  {
		  System.out.println("true");
		  
	  }
	  //there wont be two gaurav created 
	  //only one gaurav will be created but two refernces will be created which will reference to same 
	  
	  //once a string is created its a constant in java 
	  */
	   //a new refernce is created here 
	   String name2="gaurav";
	   
	   String name = "gaurav";
	   
	   name=name + "Pai";
	   
	   System.out.print(name);
	   
	   if(name2==name)
	   {
		   System.out.println("true");
		   
	   }
	   else
	   {
		   System.out.println("false");
		   
	   }
	   
	   
	  
	   
   }
}
