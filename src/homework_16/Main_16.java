package homework_16;

import java.util.Arrays;
import java.util.List;

public class Main_16 {
    public static void main(String[] args) {

        String filePath = "/src/homework_16/Output.txt";

        Employee employee1 = new Employee("Bob", 343322, 7639);

        Methods.serealize(employee1, filePath);
        Methods.deserealize(filePath);

        Employee employee2 = new Employee("Sam", 764322, 2345);
        Employee employee3 = new Employee("Mark", 887654, 4567);

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
        for(Employee employee : employees){
            Methods.serealize(employee, filePath);
            Methods.deserealize(filePath);
        }

        Salary salary = new Salary(234, 2349876);
        Employee employee4 = new Employee("Tom", 459823, salary);

        Methods.serealize(employee4, filePath);
        Methods.deserealize(filePath);
    }
}

