package homework_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main_19 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person(null, 18));
        list.add(null);
        list.add(new Person("Matt", 19));
        list.add(new Person("Mark", 22));
        list.add(null);
        list.add(new Person(null, 33));
        String defaultName = "Joe";

        list.forEach(person -> {
            Optional<Person> optionalPerson = Optional.ofNullable(person);
            if(optionalPerson.isPresent())
                System.out.println(optionalPerson.map(p -> p.getName()).orElse(defaultName));
        });

        List<Person> newPeople = new ArrayList<>();

        list.forEach(person -> {
            Optional<Person> optionalPerson = Optional.ofNullable(person);
            if(optionalPerson.isPresent())
                newPeople.add(new Person(optionalPerson.ofNullable(person.getName()).orElseGet(() -> defaultName), person.getAge()));
        });

        newPeople.forEach(person -> System.out.println(person.getName()));
    }
}
