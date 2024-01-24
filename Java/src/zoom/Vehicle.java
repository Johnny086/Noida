package zoom;

public class Vehicle {
 int x=30;
 public void test() 
 {
  System.out.println("This is test method");
  int x=60;
  System.out.println("Local X is "+x);
  System.out.println("Main or Global x is "+this.x);
	
 }

}
