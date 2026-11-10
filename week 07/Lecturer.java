public class Lecturer {
    private String name;
    private String firstname;
    private String lastname;
    private String department;
    private String address;
    private int age;

    public Lecturer(String name, String firstname, String lastname, String department, String address, int age) {
        this.name = name;
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDepartment() {
        return department;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

}
