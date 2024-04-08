// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fibonacci fib1 = new Fibonacci(18,9,9);
        Thread thread1 = new Thread(fib1);
        thread1.start();

        Fibonacci fib2 = new Fibonacci(20,15,5);
        Thread thread2 = new Thread(fib2);
        thread2.start();

        Fibonacci fib3 = new Fibonacci(100,25,75);
        Thread thread3 = new Thread(fib3);
        thread3.start();
    }
}
//jaden rulz