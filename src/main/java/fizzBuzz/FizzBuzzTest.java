package fizzBuzz;

public class FizzBuzzTest {
    public static void main(String[] args) throws InterruptedException {

        FizzBuzzThread fizzBuzzThread = new FizzBuzzThread();

        for (int i = 1; i <= 50; i++) {
            int number = i;

            Thread threadA = new Thread(() -> fizzBuzzThread.fizz(number));
            Thread threadB = new Thread(() -> fizzBuzzThread.buzz(number));
            Thread threadC = new Thread(() -> fizzBuzzThread.fizzbuzz(number));
            Thread threadD = new Thread(() -> fizzBuzzThread.num(number));

            threadA.start();
            threadA.join();
            threadB.start();
            threadB.join();
            threadC.start();
            threadC.join();
            threadD.start();
            threadD.join();
        }
    }
}
