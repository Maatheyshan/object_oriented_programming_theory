public class Car extends Vehicle {
	
	private int door;
	private Transmission transmission;
	
	public Car(String vehicleID, 
			String make, 
			String model, 
			int topSpeed, 
			int capacity, 
			int door,
			Transmission transmission) {
		super(vehicleID, make, model, topSpeed, capacity);
		this.door = door;
		this.transmission = transmission;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}
	
	@Override
	public void moving() {
		System.out.println("Move like car");
	}
}

















