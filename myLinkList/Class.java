import java.util.Scanner;

/**
 * Write a description of class Class here.
 *
 * @author (Nicholas Rapacciuolo)
 * @version (1.0)
 */
public class Class
{
    private ArrayList<Student> students;
    // Constructor
    public Class() 
    {
        students = new ArrayList<Student>();
    }

    // Method to add a student
    public void addStudent(Student student) 
    {
        if (!students.contains(student))
        {
            students.add(student);
        }
    }

    // Method to remove a student by ID
    public boolean removeStudent(int id) 
    {
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i) != null && students.get(i).getId() == id)
            {
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    // Method to search a student by id
    public boolean searchStudent(int id) 
    {
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i) != null && students.get(i).getId() == id)
            {
                return true;
            }
        } 
        return false;
    }

    //Display all students in the following format
    //id: 1234
    //Name: Tim
    //******************
    //id: 1235
    //Name: Tom
    //...
    public String toString() 
    {
        String str = "";
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i) != null)
            {
                str += "id: " + students.get(i).getId() + "\nName: " + students.get(i).getName() + "\n************************\n";
            }
            else break;
            
        }
        return str;
    }

    public static void main(String[] args) {
        Class cl = new Class();
        Scanner scanner = new Scanner(System.in);

        // Simple text interface
        while (true) {
            System.out.println("Choose an option: \n1. Add Student \n2. Remove Student \n3. Search Student \n4. Display All \n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Student Name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Student ID:");
                    int id = scanner.nextInt();
                    cl.addStudent(new Student(name, id));
                    break;
                case 2:
                    System.out.println("Enter Student ID to Remove:");
                    int removeId = scanner.nextInt();
                    if (cl.removeStudent(removeId)) {
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter Student id to Search:");
                    id = scanner.nextInt();
                    boolean found = cl.searchStudent(id);
                    if (found) {
                        System.out.println("Found the student");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.println(cl);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
            }
        }
    }
}
