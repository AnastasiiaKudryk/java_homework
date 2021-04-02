package homework_18;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Person {

    @MyAnnotation(number = 0)
    private String name;

    private LocalDate timestamp;

    @MyAnnotation(number = 8888)
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", timestamp=" + timestamp +
                ", age=" + age +
                '}';
    }
}
