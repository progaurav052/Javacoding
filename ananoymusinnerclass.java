package javaadvance;

//related to abstract class and functional interfaces
abstract class  Game{
	public abstract void play();
	
}
/*
class Cricket extends Game
{
	public void play()
	{
		System.out.println("Play Cricket");  //we have created this class only to implement this function
		//this is waste 
		//is there any other Method ??
		
	}
}
*/
public class ananoymusinnerclass {
	public static void main(String args[])
	{
		/*Game c=new Cricket();
		c.play();
		*/ 
		//this works 
		
		//alternate way which will avoid creation of class
		Game c=new Game(){
			public void play()
			{
				System.out.println("Play Cricket");
				
			}
		};
	
		c.play();
		
		//using lambda expression this can be further simplified
		/*Game c=()->{System.out.println("Play Cricket");};
		c.play();
		*/
		
		
		
		
	}

}
