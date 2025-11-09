import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> school = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("------School management System------");

            System.out.println("1. Add Teacher \n2. Add Student \n3. View all Students \n4. View all Teachers \n5. View everyone \n6. Exit");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    Teacher teacher = Teacher.createTeacher(scanner);
                    teachers.add(teacher);
                    school.add(teacher);
                    System.out.println("Teacher added successfully");
                    break;
                case 2:
                    Student student = Student.createStudent(scanner);
                    students.add(student);
                    school.add(student);
                    System.out.println("student added successfully");
                    break;

                case 3:
                    Student.PrintAllStudents(students);
                    break;

                case 4: 
                    Teacher.PrintAllTeachers(teachers);
                    break;

                case 5:
                    Person.printAll(school);
                    break;

                case 6:
                    System.out.println("Goodbye");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }


            
        } 

    }
}