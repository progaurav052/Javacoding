package javaending;
import java.util.*;
public class userinput {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the name:");
	        String name = sc.nextLine();

	        System.out.println("Enter a number:");
	        int num = sc.nextInt();
	        
	       

	        

	        System.out.println("The name is: " + name + "\nThe number is: " + num);

	        // Close the scanner
	        sc.close();
	    }
	

}
