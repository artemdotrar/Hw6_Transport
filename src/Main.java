public class Main {
    public static void main(String args[]) {
        Car hondaCivic = new Car(140, 220, "Honda Civic", 1400, 4, 8, "Hatchback", 5);
        CargoTransport gazel = new CargoTransport(200, 120, "Газель 1", 2000, 4, 15, 2500);
        CivilAIrTransport boing = new CivilAIrTransport(2000, 300, "Boing 747", 10000, 60, 300, 590, true);
        WarAirTransport il = new WarAirTransport(1000, 200, "ИЛ 86", 2500, 30, 200, 2, false);

        System.out.println(hondaCivic.getAllInfo());
        hondaCivic.calculateDistance(1.5);
        System.out.println();
        System.out.println(gazel.getAllInfo());
        gazel.loadCargo(3000);
        gazel.loadCargo(2000);
        System.out.println();
        System.out.println(boing.getAllInfo());
        boing.loadPassengers(600);
        boing.loadPassengers(500);
        System.out.println();
        System.out.println(il.getAllInfo());
        il.fire();
        il.fire();
        il.fire();
        il.catapult();
    }
}
