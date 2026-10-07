import java.util.Scanner;


public class ArrayTest {

    public static final int SIZE = 10;


    public static void main(String[] args) {
        // What if I want to store 10 numbers
        // find the sum of the numbers and display the sum
        int sum = 0;

        // step 1: create an array of size 10
        int[] numbers = new int[SIZE];

        // step 2: create scanner object to read input from user
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number for index " + i + ": ");
            numbers[i] = sc.nextInt();
        }

        // step 3: Calculate the sum of the numbers in the array
        int total = 0;
        for(int num : numbers) {
            total += num;
        }

        System.out.println("Number in the array: " + numbers);
        System.out.println("The sum of the numbers is: " + total);

    }

}