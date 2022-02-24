/*
Code without Lambda
 */

public class DeadLock {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(new Runnable() {// Runnable  - анонимный класс-объект
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start");
                synchronized (lock1) {// захватываем монитор1
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();// Ждем, а в то время захватится второй
                    }
                    synchronized (lock2) {//не отпуская захватывем второй не отпуская первый
                    }
                }
                System.out.println(Thread.currentThread().getName() + " end");
            }
        });

                Thread thread2 = new Thread(new Runnable() {// Runnable  - анонимный класс-объект
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start");
                synchronized (lock2) {
                    synchronized (lock1) {//не отпуская захватывем второй не отпуская первый
                    }
                }
                System.out.println(Thread.currentThread().getName() + " end");
            }
        });
                thread1.start();
                thread2.start();

        }
        }