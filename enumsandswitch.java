package javaadvance;
 enum weekdays{
	Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}

public class enumsandswitch {
    public static void main(String args[])
    {
    	weekdays day= weekdays.Monday;
    	//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
    	
    	switch(day)
    	{
    	case Monday: System.out.println("its Monday");
    				 break;
    	
    	case Tuesday: System.out.println("its Tuesday");
    	              break;
    	case Wednesday: System.out.println("its Wednesday");
    					break;
    	case Thursday: System.out.println("its Thusday");
    					break;
    	case Friday: System.out.println("its friday");
    				break;
    				
    	case Saturday: System.out.println("its Monday");
    					break;
    					
    	}
    }
}
