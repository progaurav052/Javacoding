package collectionjava;
import java.util.*;
class Student{ //every class extends object class by default 
	int marks;
	String name;
	
	public Student(String name ,int marks)
	{
		this.marks=marks;
		this.name=name;
		
		
	}
	 @Override
	    public String toString() {
	        return "Student{name='" + name + "', marks=" + marks + "}";
	    }
	 
	
	
	
}
public class studentsort {
    public static void main(String args[])
    {
    	Comparator<Student> comp=new Comparator<Student>() {
    		public int compare(Student A,Student B)
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
    	
    	List<Student> studs=new ArrayList<Student>();
    	studs.add(new Student("Gaurav",98));
    	studs.add(new Student("Rahul",67));
    	studs.add(new Student("Jeev",78));
    	studs.add(new Student("Harshith",83));
    	studs.add(new Student("Emmanuel",76));
    	
    	Collections.sort(studs,comp);
    	
    	System.out.println(studs);
    	
    	
    	
    	
    		
    }
}
