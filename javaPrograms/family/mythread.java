class Printer {
    private boolean isThread1Turn = true; // Flag to alternate between threads

    synchronized void printer(String name, boolean isThread1) {
        for (int i = 0; i < 5; i++) {
            while (isThread1 != isThread1Turn) {
                    System.out.println(isThread1+" "+isThread1Turn);
                try {
                    wait(); // Wait until it’s the thread's turn
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            // Print the message
            System.out.println(name + " " + Thread.currentThread());

            // Alternate the turn
            isThread1Turn = !isThread1Turn;
            notifyAll(); // Notify the other thread
        }
    }
}

class WorkerThread extends Thread {
    private String name;
    private Printer printer;
    private boolean isThread1;

    WorkerThread(String name, Printer printer, boolean isThread1) {
        this.name = name;
        this.printer = printer;
        this.isThread1 = isThread1;
    }

    @Override
    public void run() {
        printer.printer(name, isThread1);
    }
}

 class main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Thread 1
        WorkerThread thread1 = new WorkerThread("Thread 1", printer, true);
        // Thread 2
        WorkerThread thread2 = new WorkerThread("Thread 2", printer, false);

        thread1.start();
        thread2.start();
    }
}
