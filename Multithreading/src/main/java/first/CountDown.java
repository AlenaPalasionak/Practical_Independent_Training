package first;

public class CountDown {
    private int i;//переменные экземпляра хранятся в куче(память приложения, которая совместно используется всеми потоками)

    public void doCountDown() {
        String colour;

        switch (Thread.currentThread().getName()) {// получаем цвет в зависимости от нити
            case "Thread 1":
                colour = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                colour = ThreadColor.ANSI_PURPLE;
                break;
            default:
                colour = ThreadColor.ANSI_GREEN;
        }
        synchronized (this){
        for(i=10; i>0;i--) {//Локальная переменная хранится в стеке потока, поэтому каждый поток содержит свою собственную копию этой переменной
            System.out.println(colour + Thread.currentThread().getName() + ": i =" + i);
        }
        }
    }
}
/*Resume:
1. Heap isn't thread-safe, cause it is used by all threads. They share one variable between each other.
2. Stack is thread -safe, cause every thread contain its own copy of variable.
3. So for thread safety is better to use local variable.
4. If we are using an instance variable we should synchronize our method.
5. We can't use --primitives-- for synchronization. We shouldn't use --local Object-- for synchronization.
 */