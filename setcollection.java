package collectionjava;

import java.util.*;
public class setcollection {
	
	public static void main(String args[])
	{
	   Collection <Integer>st=new HashSet<Integer>();
	   Collection <Integer>nums=new ArrayList<Integer>();
	   
	   nums.add(1);
	   nums.add(2);
	   nums.add(1);
	   nums.add(3);
	   nums.add(2);
	   nums.add(4);
	   
	   for(var x:nums)
	   {
		   if(st.contains(x))
		   {
			   System.out.println("the number "+x+" is already Present");
			   
		   }
		   else
		   {
			   st.add(x);
			   
		   }
	   }
	   System.out.println(st);
	   
	   
	     
	}

}
