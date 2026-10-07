import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // --- HashSet (Unordered, Fast O(1) performance) ---
        Set<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(10)); // true (first addition)
        System.out.println(hashSet.add(10)); // false (duplicate, not added)
        System.out.println(hashSet.add(10)); // false (duplicate, not added)

        hashSet.add(-10);
        hashSet.add(25);
        hashSet.add(20);
        hashSet.add(15);
        hashSet.add(8);
        hashSet.add(-120);

        System.out.println("HashSet (unordered): " + hashSet);

        // --- TreeSet (Sorted automatically, O(log n) performance) ---
        Set<Integer> treeSet = new TreeSet<>(hashSet); // Initialize with HashSet elements

        System.out.println("TreeSet (sorted): " + treeSet);
    }
}