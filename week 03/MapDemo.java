import java.util.Map;
import java.util.HashMap;       // Unordered (fastest performance, no order guarantees)
import java.util.LinkedHashMap; // Preserves insertion order
import java.util.TreeMap;       // Sorted automatically (by key in natural ascending order)

public class MapDemo {
    public static void main(String[] args) {

        //--- HashMap (Unordered, Fast O(1) performance) ---
        Map <Integer, String> map = new HashMap<>();
        map.put(1, "Michael Jackson");
        map.put(4, "Katie Perry");
        map.put(3, "Ariana Grande");
        map.put(2, "Charlie Puth");
        map.put(5, "Ed Sheeran");

        System.out.println("Map: " + map);

        // -- LinkedHashMap (Preserves insertion order) ---
        Map <Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "Michael Jackson");
        linkedMap.put(4, "Katie Perry");
        linkedMap.put(3, "Ariana Grande");
        linkedMap.put(2, "Charlie Puth");
        linkedMap.put(5, "Ed Sheeran");

        System.out.println("LinkedHashMap: " + linkedMap);

        // --- TreeMap (Sorted automatically by key in natural ascending order) ---
        Map <Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Michael Jackson");
        treeMap.put(4, "Katie Perry");
        treeMap.put(3, "Ariana Grande");
        treeMap.put(2, "Charlie Puth");
        treeMap.put(5, "Ed Sheeran");

        System.out.println("TreeMap: " + treeMap);

    }
}