import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "CS");
        Student student2 = new Student("Bob", 22, "Math");
        Student student3 = new Student("Charlie", 19, "Physics");
        Student student4 = new Student("David", 21, "CS");
        Student student5 = new Student("Eve", 23, "Biology");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        // 1. Default sort (Comparable - Alphabetical by Name)
        Collections.sort(studentList);
        System.out.println("Sorted by Name (Default):");
        System.out.println(studentList);

        System.out.println("\n-----------------------------------\n");

        // 2. Sort using custom AgeComparator class
        Collections.sort(studentList, new AgeComparator());
        System.out.println("Sorted by Age (via AgeComparator):");
        System.out.println(studentList);

        System.out.println("\n-----------------------------------\n");

        // 3. Sort using Lambda Expression (Course Descending)
        Collections.sort(studentList, (s1, s2) -> s2.getCourse().compareTo(s1.getCourse()));
        System.out.println("Sorted by Course Descending (via Lambda):");
        System.out.println(studentList);

    }
}