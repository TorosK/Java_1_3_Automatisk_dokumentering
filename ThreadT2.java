/**
 * The ThreadT2 class implements the Runnable interface and demonstrates a basic threaded task.
 * It continuously prints a message to the console until interrupted.
 */
class ThreadT2 implements Runnable {
    /**
     * The run method that contains the code executed by the thread.
     * It prints "Thread T2: Thread 2" every second until interrupted.
     */
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Thread T2: Thread 2");
            try {
                Thread.sleep(1000); // Sleeping for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Set the interrupt flag when an InterruptedException is caught
            }
        }
    }
}
