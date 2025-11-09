import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{

    int studID;
    String major;
    

    public Student(String major, int studID ,String name,String hobby, int age){
        super(name,hobby,age);

        this.studID = studID;
        this.age = age;
        this.major = major;
        
    }

    

    public static Student createStudent(Scanner scanner){

        System.out.println("Add a new student");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Hobby: ");
        String hobby = scanner.nextLine();

        System.out.print("Major: ");
        String major = scanner.nextLine();


        System.out.print("Student ID: ");
        int studID = scanner.nextInt();
        scanner.nextLine();

        return new Student(major, studID, name, hobby, age);

    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("Student ID: %d \nMajor: %s\n",studID,major);
    }

    public static void PrintAllStudents(ArrayList<Student> students){

        System.out.println("---all students---");

        if (students.isEmpty()){
            System.out.println("No students in the system.");
            return;
        }

        for (int i = 0; i<students.size();i++){
            System.out.println("Student "+(i+1)+": ");
            students.get(i).displayInfo();
        }
    
    }
    
}
