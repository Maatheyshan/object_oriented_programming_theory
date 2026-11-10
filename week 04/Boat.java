
public class Boat extends Vehicle {

    // Instance variables
    private int length;
    private int engines;

    // Constructor
    public Boat(String vehicleID, String make, String model,
                int topSpeed, int capacity, int length, int engines) {

        super(vehicleID, make, model, topSpeed, capacity);

        this.length = length;
        this.engines = engines;
    }

    // Getter and setter for length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Getter and setter for engines
    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }
}
