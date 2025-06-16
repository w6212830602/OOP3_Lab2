package exercise1;

/**
 * Represents a student with a name and age.
 * Implements Comparable<Student> to allow sorting by name.
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     * Allows sorting by name using Comparable interface.
     */
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    /**
     * Returns string representation of a student.
     */
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
