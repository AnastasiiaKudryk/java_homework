package homework_17;

import java.util.Scanner;

public class Main_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of Fibonacci sequence: ");

        MyThread myThread = new MyThread(scanner.nextInt(),1000);
        myThread.start();

    }
}
