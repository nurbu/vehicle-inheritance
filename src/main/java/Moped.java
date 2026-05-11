public class Moped extends Vehicle {
    private int maxWeight;

    public Moped(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int maxWeight) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.maxWeight = maxWeight;
    }

    public void ride() {
        System.out.println("Ride ...");
    }

    @Override
    public String toString() {
        return "Model: " + getModel() + "Color: " + getColor() + ""
    }
}
