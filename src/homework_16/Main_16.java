package homework_16;

import java.util.Arrays;
import java.util.List;

public class Main_16 {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Bob", 343322, 7639);
        Methods method1 = new Methods(employee1);

        method1.serealize();
        method1.deserealize();

        Employee employee2 = new Employee("Sam", 764322, 2345);
        Employee employee3 = new Employee("Mark", 887654, 4567);
        Methods method2;

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
        for(Employee employee : employees){
            method2 = new Methods(employee);
            method2.serealize();
            method2.deserealize();
        }

        Salary salary = new Salary(234, 2349876);
        Employee employee4 = new Employee("Tom", 459823, salary);
        Methods method3 = new Methods(employee4);

        method3.serealize();
        method3.deserealize();
    }
}

