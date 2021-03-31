package homework_17;

import java.util.Scanner;

public class Main_17_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of Fibonacci sequence: ");

        Thread thread = new Thread(new RunnableThread(scanner.nextInt(), 1000));
        thread.start();

    }
}
