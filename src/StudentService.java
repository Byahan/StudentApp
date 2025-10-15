import java.util.ArrayList;
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
        Student found = students.stream()
                .filter(s -> s.getNim().equalsIgnoreCase(nim))
                .findFirst()
                .orElse(null);

        if (found != null) {
            students.remove(found);
            System.out.println("Student with NIM " + nim + " deleted successfully.");
        } else {
            System.out.println("No student found with NIM: " + nim);
        }
    }
}
