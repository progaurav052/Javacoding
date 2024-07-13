package javaone;

public class createarray {
	
	public static void main(String args[])
	{
		/*int num[]= {4,5,6};//here we need not specify size
		System.out.println(num[1]);
		int nums[]=new int[4];
		//here we need to specify size
		//iterate using loop
		for(int i=0;i<4;i++)
		{
			System.out.println(nums[i]);
			
		}
		
		*/
		
		//multi array 
		
		int num[][]= new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(num[i][j]);
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}

}
