package collectionjava;
import java.util.*;
class Students implements Comparable<Students>{ //every class extends object class by default 
	int marks;
	String name;
	
	public Students(String name ,int marks)
	{
		this.marks=marks;
		this.name=name;
		
		
	}
	 @Override
	    public String toString() {
	        return "Student{name='" + name + "', marks=" + marks + "}";
	    }
	 
	 /*
	   public int compareTo(Integer anotherInteger) {
      return compare(this.value, anotherInteger.value);
  
	  */
	 //this is there in Integer class ,hence it has default sort
	 //by default sort
	 public int compareTo(Students anotherStudent)
	 {
		 if(anotherStudent.marks>this.marks)
		 {
			 return 1;
			 
		 }
		 else
		 {
			 return -1;
			 
		 }
	 }
	
	
}

public class comparablevscomparator {
	public static void main(String args[])
	{
		//we saw that integer has a default sort 
		//that is increasing order 
		//but we created a student objects and tried to sort it 
		//but it didnt work
		//why ??
		//because the Type integer implements comparable interface which has default sorting 
		//this will be used if we need custom sort
		Comparator<Students> comp=new Comparator<Students>() {
			//comparator is an interface 
			public int compare(Students A,Students B)
			{
				if(A.marks>B.marks)
				{
					return 1;
					
				}
				else
				{
					return -1;
					
				}
			}
		};
		//this is one way where we are passing comp to sort 
		//we can have a default sort like other classes 
		//using comparable 
		
		
		List<Students> studs=new ArrayList<Students>();
    	studs.add(new Students("Gaurav",98));
    	studs.add(new Students("Rahul",67));
    	studs.add(new Students("Jeev",78));
    	studs.add(new Students("Harshith",83));
    	studs.add(new Students("Emmanuel",76));
    	
    	Collections.sort(studs);
    	
    	System.out.println(studs);
		
		
	}
}
