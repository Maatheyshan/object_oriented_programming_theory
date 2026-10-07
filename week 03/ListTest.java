import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {

    public static void main(String[] args) {

        // Programming to Super Type
        List<Object> objects = new ArrayList<>();
        objects.add(5);
        objects.add(10);
        objects.add("Hello");
        objects.add(new Scanner(System.in));

        // Type Safety
        List<Integer> integers = new ArrayList<>();
        // only Integer objects can be added to the list

        // JCF
        final int SIZE = 10;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter an integer: " + i + " ");
            integers.add(sc.nextInt());
        }

        integers.set(0, 100);

        System.out.println("The list of integers is: " + integers);

        sc.close();
    }
}