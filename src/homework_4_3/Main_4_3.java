package homework_4_3;

public class Main_4_3 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.toString());
        animal.setName("Бик");
        animal.setSpeed(2);
        animal.setAge(14);
        System.out.println(animal.toString());
    }
}
