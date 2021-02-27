package homework_8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_8_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("a: ");
            int a = scanner.nextInt();
            System.out.println("b: ");
            int b = scanner.nextInt();
            int sum=a+b;
            System.out.println("a + b = "+sum);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid number");
        }
    }
}
