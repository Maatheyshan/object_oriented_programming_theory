public class Car {

    // Instance variables
    private String carID;
    private String make;
    private String model;
    private int topSpeed;
    private int capacity;
    private int doors;
    private String transmission;

    // Constructor
    public Car(String carID, String make, String model,
               int topSpeed, int capacity, int doors,
               String transmission) {

        this.carID = carID;
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.capacity = capacity;
        this.doors = doors;
        this.transmission = transmission;
    }

    // Getters and setters for carID
    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    // Getters and setters for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getters and setters for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getters and setters for topSpeed
    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    // Getters and setters for capacity
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Getters and setters for doors
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    // Getters and setters for transmission
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
