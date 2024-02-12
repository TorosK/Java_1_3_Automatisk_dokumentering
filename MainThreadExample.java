/**
 * The MainThreadExample class demonstrates a simple multi-threaded Java application.
 * It creates and manages two threads of different types, ThreadT1 and ThreadT2.
 */
public class MainThreadExample {
    /**
     * The main method of the application. It starts both threads, waits for specific
     * intervals, and then interrupts them to demonstrate basic thread management.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Creating and starting a thread from class T1
        ThreadT1 t1 = new ThreadT1();
        t1.start();

        try {
            // Waiting for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Creating and starting a thread from class T2
        Thread t2 = new Thread(new ThreadT2());
        t2.start();

        try {
            // Waiting for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stopping thread from class T1
        t1.interrupt();

        try {
            // Waiting for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stopping thread from class T2
        t2.interrupt();
    }
}
