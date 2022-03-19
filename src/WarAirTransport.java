public class WarAirTransport extends AIrTransport {
    boolean isExistCatapult;
    int countOfRockets;

    public WarAirTransport(int power, int maxSpeed, String brand, int weight, int wingspan, int distanceForFLy, int countOfRockets, boolean isExistCatapult) {
        super(power, maxSpeed, brand, weight, wingspan, distanceForFLy);
        this.countOfRockets = countOfRockets;
        this.isExistCatapult = isExistCatapult;
    }

    public boolean isExistCatapult() {
        return isExistCatapult;
    }

    public int getCountOfRockets() {
        return countOfRockets;
    }

    public void fire() {
        if (countOfRockets > 0) {
            countOfRockets--;
            System.out.printf("Военный самолет %s произвел выстрел, осталось ракет на борту: %d\n", getBrand(), countOfRockets);
        } else {
            System.out.printf("Военный самолет не может произвести выстрел, отстутсвуют ракеты на борту\n", getBrand());
        }
    }

    public void catapult() {
        if (isExistCatapult) {
            System.out.printf("Пилот самолета %s произвел катапультирование\n", getBrand());
        } else {
            System.out.printf("Самолет %s не может произвести катапультрование пилота, отсутствует система\n", getBrand());
        }
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + ", ракет: " + countOfRockets + "система катапультирования: " + (isExistCatapult ? "есть" : "нет");
    }
}
