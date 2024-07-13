package collectionjava;
import java.util.*;
//Collection is an interface which is implemented by other interfaces like LIST,QUEUE,SET
//these interfaces are further implemented by classes like arraylist,linkedlist = LIST
//etc
/*The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).*/
public class arraylist {
	public static void main(String args[])
	{
		//collections work with objects 
		//Integer is a class here 
	 Collection<Integer> nums=new ArrayList<Integer>();
	
	 nums.add(6);
	 nums.add(3);
	 nums.add(4);
	 System.out.println(nums.isEmpty());
	 
	 
	 
	 
	 System.out.println(nums);
	 
	}
	

}
