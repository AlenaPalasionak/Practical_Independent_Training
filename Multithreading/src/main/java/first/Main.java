package first;

public class Main {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();// создали объект first.CountDown

        CountDownThread t1 = new CountDownThread(countDown);// создали объект first.CountDownThread
        t1.setName("Thread 1");
        CountDownThread t2 = new CountDownThread(countDown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();


    }
}
