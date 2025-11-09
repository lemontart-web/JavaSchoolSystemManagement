import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> school = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();


        System.out.println("------School management System------");


        System.out.println("Enter Filename: ");
        String filename = scanner.nextLine();

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String cmd = fileScanner.nextLine().trim();
                if (cmd.isEmpty()) continue;

                switch (cmd) {
                case "1":

                    Teacher teacher = Teacher.createTeacher(fileScanner);
                    teachers.add(teacher);
                    school.add(teacher);
                    System.out.println("Teacher added successfully");
                    break;
                case "2":
                    Student student = Student.createStudent(fileScanner);
                    students.add(student);
                    school.add(student);
                    System.out.println("student added successfully");
                    break;

                case "3":
                    Student.PrintAllStudents(students);
                    break;

                case "4": 
                    Teacher.PrintAllTeachers(teachers);
                    break;

                case "5":
                    Person.printAll(school);
                    break;

                case "6":
                    System.out.println("Goodbye");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
                    
                }


            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.printf("Error: %s not found", filename);
        }

        scanner.close();

    
    }

}