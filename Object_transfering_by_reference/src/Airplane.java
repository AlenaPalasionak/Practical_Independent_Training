public class Airplane {
    private String name;
    private Long fuel;

    public Airplane() {
    }

    public Airplane(String name, Long fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFuel() {
        return fuel;
    }

    public void setFuel(Long fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
