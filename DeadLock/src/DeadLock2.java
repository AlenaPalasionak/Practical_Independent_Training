/*
Code with Lambda
 */

public class DeadLock2 {
    public static void main(String[] args) {
        Object lock1 = new Object();                  //the object for the first monitor
        Object lock2 = new Object();                //the object for the second monitor


        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            synchronized (lock1) {
                /*
                On this position we need to sleep the thread1 in order to guarantee that the thread2
                starts its work and acquires the monitor of lock2 before the thread1 does it.
                 */
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) { //bam!
                }
            }
            System.out.println(Thread.currentThread().getName() + " end");
        });

        Thread thread2 = new Thread(() -> {
                           System.out.println(Thread.currentThread().getName() + " start");
                synchronized (lock2) {       //Thread1 is still holding the monitor of lock1, thread2 acquires the monitor of lock2
                    synchronized (lock1) { //ta-da! That doesn't really look fun))
                    }
                }
                System.out.println(Thread.currentThread().getName() + " end");
        });
        thread1.start();
        thread2.start();
    }
}
