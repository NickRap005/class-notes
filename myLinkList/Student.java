
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student 
{
    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public boolean equals(Object obj) {
        return id == ((Student)obj).id;
    }

    // toString method to display student information
    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", id=" + id +
               '}';
    }
}