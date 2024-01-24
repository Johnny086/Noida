package zoom;
public class Car extends Engine {
String name;
double price;
Engine e=new Engine(60,6,"petrol");
 Car()
 {
	 
 }
 Car(String name,double price)
 {
	 this.name=name;
	 this.price=price;
 }

}
