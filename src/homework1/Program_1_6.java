package homework1;

import java.util.Scanner;

public class Program_1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("введіть число: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("максимальне число: " + max(arr));
        System.out.println("мінімальне число: " + min(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}

