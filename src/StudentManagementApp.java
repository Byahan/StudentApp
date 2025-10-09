import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n=== Student Management Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Delete Student by NIM");
            System.out.println("99. Exit");
            System.out.print("Choose option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter NIM: ");
                    String nim = scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Date of Birth (YYYY-MM-dd): ");
                    LocalDate dob = null;
                    try {
                        dob = LocalDate.parse(scanner.nextLine());
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format! Please use YYYY-MM-dd.");
                        break;
                    }

                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();

                    Student student = new Student();
                    student.setNim(nim);
                    student.setName(name);
                    student.setDob(dob);
                    student.setAddress(address);

                    service.addStudent(student);
                    break;

                case 2:
                    service.listStudents();
                    break;

                case 3:
                    System.out.print("Enter NIM of student to delete: ");
                    String nimToDelete = scanner.nextLine();
                    service.deleteStudent(nimToDelete);
                    break;

                case 99:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
