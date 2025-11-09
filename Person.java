import java.util.ArrayList;

public class Person {

    String name, hobby;
    int age;


    public Person(String name, String hobby, int age){

        this.name = name;
        this.hobby = hobby;
        this.age = age;
        
    }

    public void displayInfo(){
        System.out.printf("Name: %s \nAge: %s\nHobby: %s\n",name,age,hobby);
    }

    public static void printAll(ArrayList<Person> people){
        System.out.println("All people");
        if (people.isEmpty()){
            System.out.println("No one in the system.");
        }

        for (int i = 0; i<people.size();i++){
            System.out.println("Person "+(i+1)+": ");
            people.get(i).displayInfo();
        }
    }


}