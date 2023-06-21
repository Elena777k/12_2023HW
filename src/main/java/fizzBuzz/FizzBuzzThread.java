package fizzBuzz;

public class FizzBuzzThread extends Thread{
    private int number;

    public synchronized void fizz(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("fizz");
        }
    }

    public synchronized void buzz(int number)  {
        if (number % 5 == 0 && number % 3 != 0){
           System.out.println("buzz");
        }
    }

    public synchronized void fizzbuzz( int number)  {
        if (number % 15 == 0){
            System.out.println("fizzbuzz");
        }
    }

    public synchronized void num ( int number) {
        if (number % 3 != 0 && number % 5 != 0) {
            System.out.println(number);
        }
    }
}












