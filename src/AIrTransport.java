public class AIrTransport extends Transport {
    private int wingspan;
    private int distanceForFLy;

    public AIrTransport(int power, int maxSpeed, String brand, int weight, int wingspan, int distanceForFLy) {
        super(power, maxSpeed, brand, weight);
        this.wingspan = wingspan;
        this.distanceForFLy = distanceForFLy;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getDistanceForFLy() {
        return distanceForFLy;
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + String.format(", размах крыльев: %d метров, длинна взлета: %d метров", wingspan, distanceForFLy);
    }
}
