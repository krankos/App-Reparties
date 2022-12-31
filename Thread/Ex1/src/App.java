public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Counter c = new Counter("A");

        // Counter c2 = new Counter("B");

        // Counter c3 = new Counter("C");

        // c.count(10);
        // c2.count(10);
        // c3.count(10);

        // Version 1

        // CounterThread t1 = new CounterThread("A", 10);
        // CounterThread t2 = new CounterThread("B", 100);
        // CounterThread t3 = new CounterThread("C", 30);

        // t1.start();
        // t2.start();
        // t3.start();

        // Version 2
        CounterThreadRunnable t1 = new CounterThreadRunnable(60);
        CounterThreadRunnable t2 = new CounterThreadRunnable(50);
        CounterThreadRunnable t3 = new CounterThreadRunnable(100);

        Thread thread1 = new Thread(t1, "A");
        Thread thread2 = new Thread(t2, "B");
        Thread thread3 = new Thread(t3, "C");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
