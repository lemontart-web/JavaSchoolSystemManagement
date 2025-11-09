import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{

    int studID;
    String major;
    

    public Student(String major, int studID ,String name,String hobby, int age){
        super(name,hobby,age);

        this.studID = studID;
        this.major = major;
        
    }

    

    public static Student createStudent(Scanner filescanner){

        String name = filescanner.nextLine().trim();

        int age = Integer.parseInt(filescanner.nextLine().trim());
       
        String hobby = filescanner.nextLine().trim();

        String major = filescanner.nextLine().trim();

        int studID = Integer.parseInt(filescanner.nextLine().trim());

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
