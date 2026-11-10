public class Plane extends Vehicle {
	
	private int wingSpan;
	private int minRunway;
	
	public Plane(String vehicleID, String make, String model, int topSpeed, int capacity, int wingSpan, int minRunway) {
		super(vehicleID, make, model, topSpeed, capacity);
		this.wingSpan = wingSpan;
		this.minRunway = minRunway;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	public int getMinRunway() {
		return minRunway;
	}

	public void setMinRunway(int minRunway) {
		this.minRunway = minRunway;
	}
	
	@Override
	public void moving() {
		System.out.println("fly like plane");
	}

}















