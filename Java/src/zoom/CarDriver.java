package zoom;

public class CarDriver {

	public static void main(String[] args) {
	Car c1=new Car("Maruti",1235.6);
	//c1=null;
	System.out.println("Car Object adress "+c1);
	System.out.println("Engine object adress "+c1.e);
	System.out.println(c1.price);
	System.out.println(c1.e);
	System.out.println(c1.name);
	System.out.println(c1.e.hp);
	

	}

}
