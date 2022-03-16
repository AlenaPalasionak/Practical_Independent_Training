public class A {
    String s;

    public A(String s) {
        this.s = s;
    }
    @Override
    public boolean equals(Object obj) {
        A a = (A) obj;
        return this.s == a.s;
    }

}
