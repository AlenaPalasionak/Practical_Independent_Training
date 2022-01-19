public class User {                     //при созд. объекта user - ссылка на него  в стэке, сам - в хипе
    public static void main(String[] args) {
        int age = 42;                   //поле, примитивный тип, но храниться в куче, где и объект
        String name = "John Doe";      //ссылочный тип, храниться в куче, где и объект
    }

    public void someMethod() {
        int someVar = 2;                //переменные и они хранятся в стеке.
        User user = new User();         //При завершении метода кадр стека будет уничтожен и вместе
                                        // с ним перестанут существовать переменные someVar и user

    }
}
