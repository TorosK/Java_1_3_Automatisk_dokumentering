/**
 * The ThreadT1 class extends the Thread class and demonstrates a basic threaded task.
 * It continuously prints a message to the console until interrupted.
 */
class ThreadT1 extends Thread {
    /**
     * The run method that contains the code executed by the thread.
     * It prints "Thread T1: Thread 1" every second until interrupted.
     */
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Thread T1: Thread 1");
            try {
                Thread.sleep(1000); // Sleeping for 1 second
            } catch (InterruptedException e) {
                interrupt(); // Set the interrupt flag when an InterruptedException is caught
            }
        }
    }
}
