public class ImmutableLesson {
    public static void main(String[] args) {

        String str1 = "I love Java";

        String str2 = str1;//обе переменные-ссылки указывают на одну строку.
        System.out.println(str2);

        str1.replace("Java", "Python");//попробуем изменить состояние str1, заменив слово "Java" на “Python”
        System.out.println(str2);
    }
}
/*
Immutable are:
•	String,
•	all wrappers (Integer, Double),
•	StackTrace.
All the string methods work only if we write down the result in a new variable.
Thread safe

 */