
public class Plane extends Vehicle {

    // Instance variables
    private int wingspan;
    private int engines;

    // Constructor
    public Plane(String vehicleID, String vehicleType, String model,
                 int topSpeed, int capacity, int wingspan, int engines) {

        super(vehicleID, vehicleType, model, topSpeed, capacity);

        this.wingspan = wingspan;
        this.engines = engines;
    }

    // Getter and setter for wingspan
    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    // Getter and setter for engines
    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }
}
