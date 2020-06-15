import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args)
    {
        Person[] people = { new Person("Fernando"), new Person("Justin"), new Person("Aaron")};
//        for (Person persons: people ){
//            System.out.println(persons.getName());
//        }

        Person[] newName = addPerson(people);
        for (Person it: newName ){
            System.out.println(it.getName());
        }
    }
    public static Person[] addPerson(Person[] Person){
        Person[] anotherPerson = Arrays.copyOf(Person, Person.length +1);
        anotherPerson[3] = new Person("Dylan");
        return anotherPerson;
    }
}