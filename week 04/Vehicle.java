
public class Vehicle {

    private String vehicleID;
    private String vehicleType;
    private int topSpeed;
    private int capacity;
    private String model;

    public Vehicle(String vehicleID, String vehicleType, String model,
                   int topSpeed, int capacity) {

        this.vehicleID = vehicleID;
        this.vehicleType = vehicleType;
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

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
