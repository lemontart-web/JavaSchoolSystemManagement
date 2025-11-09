import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Person{

    String subject;
    double salary;


    public Teacher(double salary,String subject, String name, String hobby, int age){

        super(name,hobby,age);

        this.salary = salary;
        this.subject = subject;

    }

    @Override 
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("Salary %.2f \nSubject: %s\n",salary,subject);
    }

    public static Teacher createTeacher(Scanner scanner){

        System.out.println("Add a new Teacher");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Hobby: ");
        String hobby = scanner.nextLine();

        System.out.print("Subject: ");
        String subject = scanner.nextLine();


        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        return new Teacher(salary, subject, name, hobby, age);

    }

    public static void PrintAllTeachers(ArrayList<Teacher> teachers){

        System.out.println("---all Teachers---");

        if (teachers.isEmpty()){
            System.out.println("No teachers in the system.");
            return;
        }

        for (int i = 0; i<teachers.size();i++){
            System.out.println("Teacher "+(i+1)+": ");
            teachers.get(i).displayInfo();
        }
    
    }


    
}
