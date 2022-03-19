public class GroundTransport extends Transport {
    private int countOfWheels;
    private int consumptionFuel;

    public GroundTransport(int power, int maxSpeed, String brand, int weight, int countOfWheels, int consumptionFuel) {
        super(power, maxSpeed, brand, weight);
        this.countOfWheels = countOfWheels;
        this.consumptionFuel = consumptionFuel;
    }

    public int getConsumptionFuel() {
        return consumptionFuel;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + String.format(", колес: %d, расход топлива на 100км: %d", countOfWheels, consumptionFuel);
    }
}
