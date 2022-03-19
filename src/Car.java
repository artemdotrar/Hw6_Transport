public class Car extends GroundTransport {
    private String body;
    private int countOfPassenger;

    public Car(int power, int maxSpeed, String brand, int weight, int countOfWheels, int consumptionFuel, String body, int countOfPassenger) {
        super(power, maxSpeed, brand, weight, countOfWheels, consumptionFuel);
        this.body = body;
        this.countOfPassenger = countOfPassenger;
    }

    public String getBody() {
        return body;
    }

    public int getCountOfPassenger() {
        return countOfPassenger;
    }

    public void calculateDistance(double time) {
        double allDistance = time * getMaxSpeed();
        System.out.printf("Автомобиль %s двигаясь с максимальной скоростью %d км/ч проезжает за %.1f часа %.1f километров затрачивая %.1f литров бензина\n", getBrand(), getMaxSpeed(), time, allDistance, getSpendFuel(allDistance));
    }

    private double getSpendFuel(double allDistance) {
        return allDistance * getConsumptionFuel() / 100;
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + String.format(", тип кузова: %s, количество мест: %d", body, countOfPassenger);
    }
}
