class Printer <T>{
	T thingtoprint;
	public void print(T thingtoprint)
	{
		this.thingtoprint=thingtoprint;
		System.out.println("Printing .... Printed "+ this.thingtoprint);
		
	}
	
	
}
public class Genericsjava {
	public static void main(String args[])
	{
		//supports reusability
		Printer<Integer> p1=new Printer<Integer>();
		Printer<String> s1=new Printer<String>();
		
		p1.print(8);
		s1.print("Gaurav ");
		
		
		
	}
}

/*
public class Main {
public static void printBox(Box<?> box) {
    Object value = box.get(); // We use Object because we don't know the exact type
    System.out.println("Box contains: " + value);
}

public static void main(String[] args) {
    Box<String> stringBox = new Box<>();
    stringBox.set("Hello");
    printBox(stringBox); // The type is unknown (?)
}
}

class Box<T> {
private T value;

public void set(T value) {
    this.value = value;
}

public T get() {
    return value;
}
}
*/