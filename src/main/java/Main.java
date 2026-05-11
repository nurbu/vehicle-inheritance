public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("vrt", "black", 35, 2, 50, 50, 200);

        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.startEngine();
        slowRide.stopEngine();
    }
}
