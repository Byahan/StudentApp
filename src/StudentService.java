import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n=== List of Students ===");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void deleteStudent(String nim) {
        Iterator<Student> iterator = students.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getNim().equalsIgnoreCase(nim)) {
                iterator.remove();
                found = true;
                System.out.println("Student with NIM " + nim + " deleted successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("No student found with NIM: " + nim);
        }
    }
}
