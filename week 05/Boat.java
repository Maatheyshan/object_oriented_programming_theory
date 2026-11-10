public class Boat extends Vehicle {

	private int minDepth;
	private HullMaterial hullMaterial;
	public Boat(String vehicleID, 
			String make, 
			String model, 
			int topSpeed, 
			int capacity, 
			int minDepth,
			HullMaterial hullMaterial) {
		super(vehicleID, make, model, topSpeed, capacity);
		this.minDepth = minDepth;
		this.hullMaterial = hullMaterial;
	}
	public int getMinDepth() {
		return minDepth;
	}
	public void setMinDepth(int minDepth) {
		this.minDepth = minDepth;
	}
	public HullMaterial getHullMaterial() {
		return hullMaterial;
	}
	public void setHullMaterial(HullMaterial hullMaterial) {
		this.hullMaterial = hullMaterial;
	}
	
	@Override
	public void moving() {
		// TODO Auto-generated method stub
		
	} 
}

















