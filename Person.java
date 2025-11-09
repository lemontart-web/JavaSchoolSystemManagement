import java.util.ArrayList;

public abstract class Person {

    String name, hobby;
    int age;


    public Person(String name, String hobby, int age){

        this.name = name;
        this.hobby = hobby;
        this.age = age;
        
    }

    public abstract void displayInfo();

    public static void printAll(ArrayList<Person> people){
        System.out.println("----All people----");
        if (people.isEmpty()){
            System.out.println("No one in the system.");
        }

        for (int i = 0; i<people.size();i++){
            System.out.println("Person "+(i+1)+": ");
            people.get(i).displayInfo();
        }
    }


}