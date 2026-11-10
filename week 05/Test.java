public class Test {

	public static void main(String[] args) {
		Vehicle v = null; // I'm creating variable of type Vehicle
		// possible to create variable of abstract class
		// not object of abstract class
		// abstract class is for inheritance
		
		// v = new Vehicle("CCC-1244", "Toyota", "Aqua 2025", 180, 4);
		
		// programming to interface (programming to super type)
		v = new Car("CCC-1244", 
				"Toyota", 
				"Aqua 2025", 
				180, 
				4, 
				5, 
				Transmission.AUTO);
		
		rent(v);
		// compilation time it check is v is an instance of Vehicle
		
		Vehicle v2 = new Plane("VT-Colombo", 
				"Airbus", 
				"350", 
				1000, 
				500, 
				200, 
				5000);
		rent(v2);
		
		Animal sadeesha = new Human();
		sadeesha.eat();
		// at compilation time it will check if Animal has eat() method
		// it has right so it will compile --> static binding
		
		// at runtime it check what is the object type
		// object type is Human so it calls the eat from Human
		// Dynamic binding 
		
		
		
	}
	
	// advantage of programming to supertype
	
	public static void rent(Vehicle vehicle) {
		
		// at runtime it will check the object type
		
		if (vehicle instanceof Car) {
			
		}
		
	}
	
	public static void rent() {
		
	}
	
	public static void rent(Car car) {
		
	}
	
	public static void rent(Plane plane) {
		
	}
	
	public static void rent(Car car, Plane plane) {
		
	}
	
	public static void rent(Plane plane, Car car) {
		
	}

}











