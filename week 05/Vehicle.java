// this class is only for inheritance 
// not for object creation
// to avoid code duplication 
// to promote reusablity 
public abstract class Vehicle {
	
	private String vehicleID;
	private String make;
	private String model;
	private int topSpeed;
	private int capacity;
	
	public Vehicle(String vehicleID, 
			String make, 
			String model, 
			int topSpeed, 
			int capacity) {
		super();
		this.vehicleID = vehicleID;
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.capacity = capacity;
	}

	public String getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	// abstract method 
	// I want every sub class to have moving()
	// but I do not know the logic of it 
	public abstract void moving();
	// abstract method doesnt have method body
	// the moment you have an abstract method class has to become abstract

}


















