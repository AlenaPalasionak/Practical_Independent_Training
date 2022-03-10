package second;

public class Singleton {
    private static Singleton instance;// поле статик, т.к. нам нужно его вызвать из статик метода

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {// метод статический - мы можем вызвать его не создавая экземпляр класса
        // синглтон.Это нам и нужно, т.к. этот экземпляр создается именно из статического метода
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
