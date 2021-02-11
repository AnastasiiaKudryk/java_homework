package homework1;

import java.util.Scanner;

public class Program_1_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        do {
            System.out.println("введіть число");
            num=scanner.nextInt();
        } while(num!=0);
    }
}
