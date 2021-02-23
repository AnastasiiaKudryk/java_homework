package homework_6;

public class Main_6 {

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator(6, 3);
        System.out.println("sum = "+calculator.plus());
        System.out.println("difference = "+calculator.minus());
        System.out.println("product = "+calculator.multiply());
        System.out.println("fraction = "+calculator.devide());
    }
}
