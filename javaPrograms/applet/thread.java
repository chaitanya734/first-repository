import java.lang.*;
class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running: " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Start threads
        thread1.start();
        thread2.start();
         thread2.stop();
        thread3.start();
       
    }
}
