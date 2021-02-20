package homework_4_2;

public class Main_4_2 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Model1");
        car.setAge(9);
        car.setCarBodyColor("red");
        car.setHelmDiameter(3);
        car.setWheelDiameter(2);
        System.out.println(car.getModel());
        System.out.println(car.getAge());
        System.out.println(car.getCarBodyColor());
        System.out.println(car.getHelmDiameter());
        System.out.println(car.getWheelDiameter());
        System.out.println(car.toString());
        car.setModel("Model2");
        car.increaseHelmDiameter();
        car.increaseWheelDiameter();
        System.out.println(car.toString());
    }
}
