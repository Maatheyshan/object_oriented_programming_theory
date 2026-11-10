public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String course;

    // Primary constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Overloaded constructor with default course
    public Student(String name, int age) {
        this(name, age, "General");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Default sort order (alphabetical by name)
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Course: " + course + ")";
    }
}