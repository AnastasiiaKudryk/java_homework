package homework_20;

import java.util.*;

public class Main_20 {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Tom", 23, "male"));
        people.add(new Person("Susan", 9, "female"));
        people.add(new Person("Mark", 40, "male"));
        people.add(new Person("Sam", 66, "male"));
        people.add(new Person("Anna", 30, "female"));
        people.add(new Person("Mark", 12, "male"));

        people.stream().
                filter(person -> (person.getSex()=="male"&&(person.getAge()>=18)&&(person.getAge()<=27))).
                forEach(person -> System.out.println(person.toString()));

        System.out.println(people.stream().
                filter(person -> (person.getSex()=="male")).
                mapToInt(Person::getAge).
                average().
                getAsDouble());

        people.stream().
                filter(person -> (person.getAge()>=18)).
                filter(person -> ((person.getSex()=="male"&&person.getAge()<60))||
                        (person.getSex()=="female"&&person.getAge()<55)).
                forEach(person -> System.out.println(person.toString()));

        people.stream().
                sorted(Comparator.comparing(Person::getName).reversed()).
                forEach(person -> System.out.println(person.toString()));

        people.stream().
                sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge)).
                forEach(person -> System.out.println(person.toString()));

        System.out.println(people.stream().
                max(Comparator.comparing(Person::getAge)).
                get().toString());

        System.out.println(people.stream().
                min(Comparator.comparing(Person::getAge)).
                get().toString());

        System.out.println(people.stream().
                filter(person -> person.getSex()=="male").
                count());

        System.out.println(people.stream().
                filter(person -> person.getSex()=="female").
                count());

        people.stream().
                filter(person -> (person.getSex()=="female"&&(person.getName().startsWith("A")))).
                forEach(person -> System.out.println(person.toString()));
    }
}
