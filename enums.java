
package javaadvance;

//is a class 
//is used to define group of constants 
enum status{
	sent,recieved,approved,success
}
public class enums {
	public static void main(String args[])
	{
		status s=status.sent;
		System.out.println(s);
		
		//enhanced for loop
		status []a=status.values();
		
		for(status ss:a)
		{
			System.out.println(ss);
			
		}
		
	}
}
