import java.util.Scanner;

public class circletest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for radius input
        System.out.print("Enter the radius of the circle: ");
        double userRadius = sc.nextDouble();

        // Create circle object with user's value
        circle obj = new circle(userRadius);  // calling the Constructor from circletset.java [ attching the argument (value) from user ]

        // Display results
        System.out.println("\n=== Circle Details ===");
        System.out.println("Radius: " + obj.getRadius());
        System.out.println("Area: " + obj.getArea()); // here every calling points are here
        System.out.println("Perimeter: " + obj.getPerimeter());
        System.out.println("Total circle objects created: " + circle.getObjectCounter());

        // Getting user input
//        System.out.println("\n=== Next Radius ===");\
//        System.out.println("\n=== Next Radius ===");\
//        System.out.println("\n=== Next Radius ===");\
//        System.out.println("\n=== Next Radius ===");\
        System.out.print("Enter the new radius of the circle: ");
        double newRadius = sc.nextDouble();
        obj.setRadius(newRadius);
        System.out.println("The radius is : " + obj.getRadius());
        sc.close();

    }
}