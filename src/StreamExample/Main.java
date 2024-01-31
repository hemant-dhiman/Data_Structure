package StreamExample;

import java.util.List;

public class Main {
    public static List<Person> getPersons(){
        return List.of(new Person("Hemant", 20, Gender.MALE));
    }
    public static void main(String[] args) {
        List<Person> persons = getPersons();
        persons.forEach(System.out::println);
    }
}
