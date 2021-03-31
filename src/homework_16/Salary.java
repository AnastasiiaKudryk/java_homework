package homework_16;

public class Salary {
    private int hourSalary;
    private int yearSalary;

    public Salary(int hourSalary, int yearSalary) {
        this.hourSalary = hourSalary;
        this.yearSalary = yearSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "hourSalary=" + hourSalary +
                ", yearSalary=" + yearSalary +
                '}';
    }
}
