package homework1;

import java.util.Scanner;

public class Program_1_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        do {
            System.out.println("8*9=");
            num=scanner.nextInt();
        } while(num!=72);
        System.out.println("Це правильна відповідь");
    }
}
