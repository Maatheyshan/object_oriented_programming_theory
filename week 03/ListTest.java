import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {

    public static void main(String[] args) {

        // Programming to Super Type (demonstrating heterogeneous collection)
        List<Object> objects = new ArrayList<>();
        objects.add(5);
        objects.add(10);
        objects.add("Hello");
        objects.add(new Scanner(System.in));

        // Type Safety (only Integer objects allowed)
        List<Integer> integers = new ArrayList<>();

        final int SIZE = 10;
        Scanner sc = new Scanner(System.in);

        // Populate the list with 10 user inputs
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter an integer " + i + ": ");
            integers.add(sc.nextInt());
        }

        // Replaces the element at index 0 with 100
        integers.set(0, 100);

        System.out.println("The list of integers is: " + integers);

        sc.close();
    }
}