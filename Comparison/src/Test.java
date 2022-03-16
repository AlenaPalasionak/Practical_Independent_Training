public class Test {

    public static void main(String[] args) {
        A a =new A("5");
        A a2 = new A("5");
        A a3 = new A("k");
        System.out.println(a==a2);
        System.out.println(a.equals(a2));
        a =a3;
        a2 = a3;
        System.out.println(a==a2);

    }
}
