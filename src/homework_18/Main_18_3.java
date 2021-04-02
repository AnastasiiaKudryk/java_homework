package homework_18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main_18_3 {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Tom", 13));
        people.add(new Person("Sam", 56));
        people.add(new Person("Bob", 24));

        List<Person> adults = new ArrayList<>();
        people.forEach(person -> {
            if(person.getAge()>=18) adults.add(person);
        });

        people.forEach(person -> {
            person.setTimestamp(LocalDate.now());
            System.out.println(person.toString());
        });

        List<String> words = new ArrayList<>();
        words.add("aaaaaaa");
        words.add("bb");
        words.add("ccc");

        List<Integer> length = new ArrayList<>();
        words.forEach(word ->{
            length.add(word.length());
        });
    }
}
