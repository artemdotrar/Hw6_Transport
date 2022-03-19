public class CivilAIrTransport extends AIrTransport {
    private int countOfPassenger;
    private boolean isExistBusiness;

    public CivilAIrTransport(int power, int maxSpeed, String brand, int weight, int wingspan, int distanceForFLy, int countOfPassenger, boolean isExistBusiness) {
        super(power, maxSpeed, brand, weight, wingspan, distanceForFLy);
        this.countOfPassenger = countOfPassenger;
        this.isExistBusiness = isExistBusiness;
    }

    public int getCountOfPassenger() {
        return countOfPassenger;
    }

    public boolean isExistBusiness() {
        return isExistBusiness;
    }

    public void loadPassengers(int countOfLoadPassengers) {
        if (countOfLoadPassengers > countOfPassenger) {
            System.out.printf("Самолет %s с максимальным числом пассажиров %d не может вместить %d пассажиров\n", getBrand(), countOfPassenger, countOfLoadPassengers);
        } else {
            System.out.printf("Самолет %s загружен %d пассажирами\n", getBrand(), countOfLoadPassengers);
        }
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + ", вместимость пассажиров: " + countOfPassenger + ", места бизнесс-класса " + (isExistBusiness ? "присутствуют" : "отсутствуют");
    }
}
