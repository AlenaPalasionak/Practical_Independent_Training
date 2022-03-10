package first;

public class CountDownThread extends Thread{
    private CountDown threadCountDown;

    public CountDownThread(CountDown countDown) {
        threadCountDown = countDown;
    }

    @Override
    public void run() {
        threadCountDown.doCountDown();
    }
}
