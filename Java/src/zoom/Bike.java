package zoom;

public class Bike extends Vehicle {

	int a=40;
	public void deno()
	{
		System.out.println("This is demo method");
		int x=80;
		System.out.println("Here local x is "+x);
		System.out.println("Here Parent class x is "+super.x);
		super.test();
	}
}
