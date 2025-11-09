import java.util.ArrayList;

public class Person {

    String name, hobby;
    int age;


    public Person(String name, String hobby, int age){

        this.name = name;
        this.hobby = hobby;
        this.age = age;
        
    }

    public void displayInfo() {
    System.out.println("┌──────────────────────────────────┐");
    System.out.println("│           PERSON INFO            │");
    System.out.println("├──────────────────────────────────┤");
    System.out.printf("│ Name:  %-25s │\n", name);
    System.out.printf("│ Age:   %-25s │\n", age);
    System.out.printf("│ Hobby: %-25s │\n", hobby);
    System.out.println("└──────────────────────────────────┘");
}

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