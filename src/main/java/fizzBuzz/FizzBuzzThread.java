package fizzBuzz;

import java.util.concurrent.BlockingQueue;

public class FizzBuzzThread extends Thread{
    private BlockingQueue<String> queue;

    public FizzBuzzThread(BlockingQueue<String> queue){
        this.queue = queue;
    }
//    private int number;

    public synchronized void fizz(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            queue.add("fizz");
        }
    }

    public synchronized void buzz(int number)  {
        if (number % 5 == 0 && number % 3 != 0){
            queue.add("buzz");
        }
    }

    public synchronized void fizzbuzz( int number)  {
        if (number % 15 == 0){
            queue.add("fizzbuzz");
        }
    }

    public synchronized void num ( int number) {
        if (number % 3 != 0 && number % 5 != 0) {
            queue.add(String.valueOf(number));
        }
    }
}












