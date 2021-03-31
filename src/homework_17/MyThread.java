package homework_17;

import java.util.ArrayList;

public class MyThread extends Thread{

    private int length;
    private long timeout;
    private ArrayList<Integer> numbers;

    public MyThread(int length, long timeout) {
        this.length = length;
        this.timeout = timeout;
    }

    public void fibonacciNumbers() {
        this.numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        for(int i=2; i<length; i++) {
            numbers.add(numbers.get(i-2) + numbers.get(i-1));
        }
    }

    @Override
    public void run() {
        this.fibonacciNumbers();

        for(int num : numbers){
            System.out.print(num + " ");
            try{
                Thread.sleep(timeout);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
