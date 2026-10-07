public class ListTest {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        // How to create an array of integers

        // Programming to Super Type
//        List numbers = new ArrayList();

        List<Object> numbers = new ArrayList<>();

        objects.add(10);
        objects.add(25.5);
        objects.add("Hello");
        objects.add(new Scanner(System.in));



        // Type Safety
        List<Integer> numbers = new ArrayList<Integer>();

        // only integers can be added to the list

        // JCF supports only objects, not primitive types
        // So we need to use wrapper classes for primitive types

//        List<int> numbers = new ArrayList<>();
        // Generics doesn't support premitive data type
        // Java provides wrapper classes for all primitive data types

        Scanner sc = new Scanner(System.in);
        for (int i=0; i < SIZE; i++) {
            System.out.print("Enter an integer "+i+" : ");
            numbers.add(sc.nextInt());
        }



    }
}