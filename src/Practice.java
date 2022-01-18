public class Practice {
    public static void main(String... args) {          //Entrant point. В коде программы может находится сколько угодно методов main, главное, чтобы они отличались набором параметров (в данном случае точкой входа будет именно первый "main")
        Boolean b = new Boolean("/true");           //потому что в классе обертке все что не совпадает с "true" является false: true не равно "/true"
        System.out.println(b);
    }

    public static void main(String args) {
        Boolean b = new Boolean("/false");
        System.out.println(b == false);
    }
}
