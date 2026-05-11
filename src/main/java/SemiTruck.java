public class SemiTruck extends Vehicle {

    private int numberOfTrailers;

    public SemiTruck(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfTrailers) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfTrailers = numberOfTrailers;
    }

    public void loadCargo() {
        System.out.println("Loading Cargo");
    }

    public void unloadCargo() {
        System.out.println("Unloading Cargo");
    }
}
