public class Transport {
    private int power;
    private int maxSpeed;
    private String brand;
    private int weight;

    public Transport(int power, int maxSpeed, String brand, int weight) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }

    protected double getPowerKilowatt() {
        return (double) power * 0.74;
    }

    public String getAllInfo() {
        return String.format("Марка: %s, максимальная скорость: %d км/ч, мощность(лош.сил): %d, мощность(киловатт): %.1f, масса: %d кг", brand, maxSpeed, power, getPowerKilowatt(), weight);
    }
}
