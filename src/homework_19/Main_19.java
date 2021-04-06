package homework_19;

import java.util.*;
import java.util.function.Function;

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
            optionalPerson.ifPresent(p ->
                System.out.println(Optional.ofNullable(p.getName()).orElse(defaultName)));
        });

        List<Person> newPeople = new ArrayList<>();

        list.forEach(person -> {
            Optional<Person> optionalPerson = Optional.ofNullable(person);
            optionalPerson.ifPresent(p ->{
                p.setName(Optional.ofNullable(p.getName()).orElse(defaultName));
                newPeople.add(p);
        });
        });

        newPeople.forEach(person -> System.out.println(person.getName()));
    }
}
