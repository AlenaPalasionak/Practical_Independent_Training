public class Starter {
    public static void main(String[] args) {

        Starter starter = new Starter();
        int flightNumber = 10;

        Airplane airplane = new Airplane("Boeing", 100_000L);
        starter.test(10, airplane);
        System.out.println("external Number: " + flightNumber);
        System.out.println("external airplane: " + airplane);

    }

    private void test(int number, Airplane airplane) {
        //number = 20;
        System.out.println("internal Number: " + number);
        System.out.println("internal airplane: " + airplane);
        airplane.setFuel(5L);
        airplane = new Airplane("Кукурузник", 500L);
        System.out.println("internal airplane: " + airplane);

    }
}
