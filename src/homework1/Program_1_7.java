package homework1;

import java.util.Scanner;

public class Program_1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("введіть число: ");
            arr[i] = scanner.nextInt();
            s+=arr[i];
        }
        System.out.println(s);
    }
}
