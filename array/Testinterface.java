package array;

 interface myInterface{
	default void show()
	{
		System.out.println("in interface");
	}
}

public class Testinterface implements myInterface{
	
	public void show2()
	{
		System.out.println("in class");
	}

	public static void main(String[] args) {
				
		Testinterface obj = new Testinterface();
		myInterface obj2 = new Testinterface();
		
		obj.show2();
		obj.show();
		
		
		obj2.show();
		
	}

}
