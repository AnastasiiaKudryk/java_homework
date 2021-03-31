package homework_16;

import java.io.Serializable;

public class Employee<T> implements Serializable {
    private String name;
    private int id;
    private transient T salary;

    public Employee(String name, int id, T salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getSalary() {
        return salary;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
