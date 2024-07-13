package collectionjava;
import java.util.*;
public class mapcollection {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Numbers are there ?");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Numbers");
		Collection <Integer>nums=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			nums.add(sc.nextInt());
		}
		System.out.println(nums);
		
		//if an "\n" occurs at start of sc.nextline()
		//than it will ignore the input
		
		Map<Integer,Integer> mpp=new HashMap<Integer,Integer>();
		for(var x:nums)
		{
			 if (mpp.containsKey(x)) {
	                mpp.put(x, mpp.get(x) + 1);
	            } else {
	                mpp.put(x, 1);
	            }
			
			
		}
		System.out.println(mpp);
		
		
		
	}
	

}
