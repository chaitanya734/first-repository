class Counter {
    int counter = 0;

    // Synchronized method to increment the counter
    synchronized void increment() {
        counter++;  // This is now thread-safe
    }
}

class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Increment the shared counter
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final value of counter
        System.out.println("Counter: " + counter.counter);
    }
}
