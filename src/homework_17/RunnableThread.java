package homework_17;

import java.util.ArrayList;

public class RunnableThread implements Runnable{

    private int length;
    private long timeout;
    private ArrayList<Integer> numbers;

    public RunnableThread(int length, long timeout) {
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

        for(int i=length-1; i>=0; i--){
            System.out.print(numbers.get(i) + " ");
            try{
                Thread.sleep(timeout);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
