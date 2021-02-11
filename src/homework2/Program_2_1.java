package homework2;
import java.util.Scanner;

public class Program_2_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть суму грошей m:");
        int m=scanner.nextInt();
        System.out.println("Введіть відсоток річних n:");
        int n=scanner.nextInt();
        System.out.println("Введіть кількість років k:");
        int k=scanner.nextInt();
        double result=m;
        for(int i=1; i<=k; i++){
            result+=n*result/100;
        }
        System.out.println("Сума грошей через k років: "+result);
    }
}
