import java.util.ArrayList;
import java.util.Objects;

public abstract class Person {

    protected String name; 
    protected String hobby;
    protected int age;


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

    @Override
    public boolean equals(Object obj){

        if (this == obj) return true;

        if (obj == null||getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        return age == person.age && Objects.equals(name,person.name) && Objects.equals(hobby, person.hobby);
    }


   @Override
    public int hashCode() {
        return Objects.hash(name,hobby,age);
    }

    @Override
    public String toString(){
        return String.format("Person{name='%s', hobby='%s',age=%d}",name,hobby,age);
    }

    


}