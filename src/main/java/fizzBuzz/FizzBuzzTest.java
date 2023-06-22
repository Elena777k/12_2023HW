package fizzBuzz;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FizzBuzzTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        FizzBuzzThread fizzBuzzThread = new FizzBuzzThread(queue);

        for (int i = 1; i <= 50; i++) {
            int number = i;

            Thread threadA = new Thread(() -> fizzBuzzThread.fizz(number));
            Thread threadB = new Thread(() -> fizzBuzzThread.buzz(number));
            Thread threadC = new Thread(() -> fizzBuzzThread.fizzbuzz(number));
            Thread threadD = new Thread(() -> fizzBuzzThread.num(number));

            threadA.start();
            threadB.start();
            threadC.start();
            threadD.start();


        }


    }
}
