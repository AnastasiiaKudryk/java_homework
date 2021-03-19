package homework_14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main_14 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Method[] methods = Person.class.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        Field[] fields = Person.class.getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        Constructor[] constructors = Person.class.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors));

        Constructor constructor1 = Person.class.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Person person = (Person) constructor1.newInstance("Alex");
        System.out.println(person.toString());

        Constructor constructor2 = Person.class.getDeclaredConstructor(String.class, int.class);
        constructor2.setAccessible(true);
        Person personWithAge = (Person) constructor2.newInstance("Sam", 54);
        System.out.println(personWithAge.toString());

        Method setAge = Person.class.getDeclaredMethod("setAge", int.class);
        setAge.setAccessible(true);
        setAge.invoke(personWithAge,24);

        Method getAge = Person.class.getDeclaredMethod("getAge", null);
        System.out.println(getAge.invoke(personWithAge, null));
    }
}
