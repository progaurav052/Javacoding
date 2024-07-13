package javaone;

class Mobile
{
    private static String brand;
    String name;
    String location;
    public static void setbrand(String b)
    {
    	brand=b;
    	
    }
    
    public void show()
    {
    	System.out.println("Phone Brand:"+brand+"\n"+"Phone name:"+name+"\n"+"Phone location:"+location+"\n");
    	
    }
    public static void showbrand()
    {
    	System.out.println("Phone Brand:"+brand);
    	
    }
    
    
};





public class staticvariable {
	public static void main(String args[])
	{
		//static variable are of global scope 
		//created when a program starts 
		//destroyed when programs ends
		//static memebers belong to the class not the object 
		//there is only one static variable ,no copies 
		//it is shared bw all 
		
		Mobile.setbrand("Iphone");
		Mobile phone1=new Mobile();
		Mobile phone2=new Mobile();
		
	    
		
		phone1.name="xmen";
		phone1.location="electra";
		
		phone2.name="antman";
		phone2.location="elnath";
		
		phone1.show();
		phone2.show();
		//since it is static it can be accessed witout object 
		//if the static variable is private how to call it ?
		//so we can use member function to call it 
		//but if object is not there how to call member 
		//so create static method
		//static members can only access static variables //because we dont which objects variable is being accessed
		
		Mobile.showbrand();
		
		
		
		//we create static block to initialize the static variables  
		
		
	}

}
