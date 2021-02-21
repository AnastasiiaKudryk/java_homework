package homework_4_3;

public class Animal {
    private String name;
    private int speed;
    private int age;

    public Animal(){
        this.name="Леопард";
        this.speed=20;
        this.age=7;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Назва тварини = " + name + ", Швидкість = " + speed + " км/год, Вік = " + age +" років.";
    }
}
