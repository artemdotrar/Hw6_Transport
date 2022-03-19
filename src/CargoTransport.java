public class CargoTransport extends GroundTransport {
    private int loadCapacity;

    public CargoTransport(int power, int maxSpeed, String brand, int weight, int countOfWheels, int consumptionFuel, int loadCapacity) {
        super(power, maxSpeed, brand, weight, countOfWheels, consumptionFuel);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void loadCargo(int weightCargo) {
        if (weightCargo > loadCapacity) {
            System.out.printf("Груз массой %d не вмещается в %s с грузоподъемностью %d\n", weightCargo, getBrand(), loadCapacity);
        } else {
            System.out.printf("%s загружен грузом массой %d кг\n", getBrand(), weightCargo);
        }
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + String.format(", вместимость груза: %d кг", loadCapacity);
    }
}
