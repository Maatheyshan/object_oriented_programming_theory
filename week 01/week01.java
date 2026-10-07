import java.util.Scanner;

public class week01 {

    public static void main(String[] args) {

        System.out.println("Calculating Circle");
        System.out.println("Circumference = 2 * Pi * Radius");

        Scanner input = new Scanner(System.in);

        System.out.print("Give Radius: ");
        double radius = input.nextDouble();

        // Create a Circle object
        Circle circle = new Circle();

        // Set the radius
        circle.setRadius(radius);

        // Get calculations from Circle class
        double circumference = circle.getCircumference();
        double area = circle.getArea();

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        input.close();
    }
}