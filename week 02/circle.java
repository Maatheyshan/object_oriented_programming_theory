public class circle extends Object {

    private double radius; // instance variable - one copy per object
    private static int objectCounter = 0; // static variable - one copy per class

    // Constructor
    public circle(double radius) {
        super();
        this.radius = radius;
        circle.objectCounter++;
    }

    // Getter for radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("radius has to greater than 0")
        }
    }

    // Getter for static objectCounter
    public static int getObjectCounter() {
        return circle.objectCounter;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference)
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}