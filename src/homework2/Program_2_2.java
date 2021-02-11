package homework2;
import java.util.Scanner;

public class Program_2_2 {
    public static void main(String[] args) {
        int l=5;
        int [] array=new int[l];
        Scanner scanner=new Scanner(System.in);
        for(int i=0; i<l; i++) {
            System.out.println("Введіть число:");
            array[i] = scanner.nextInt();
        }
        for(int i=l-1; i>=0; i--) {
            System.out.print(array[i]);
        }
    }
}
