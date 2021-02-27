package homework_8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_8_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("num: ");
            int num = scanner.nextInt();
            if(num%2!=0){
                System.out.println("Number is odd.");
            }
            else{
                System.out.println("Number is even.");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid number");
        }
    }
}
