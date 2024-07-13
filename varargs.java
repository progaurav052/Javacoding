class view
{
  public void show(Object ...arr)
  {
	  for(var item:arr)
	  {
		  System.out.println(item);
	  }
	  //object type 
  }
}
public class varargs {
    public static void main(String args[])
    {
    	view v1=new view();
    	v1.show(2,"gaurav",false,1.5,null);
    	
    }
}
