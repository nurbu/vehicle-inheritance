public class Vehicle {

    private String model;
    private String color;
    private int topSpeed;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    public void startEngine() {
        System.out.println("Starting engine ...");
    }

    public void stopEngine() {
        System.out.println("Stopping engine ...");
    }

    public void accelerate() {
        System.out.println("Accelerating ...");
    }

    public void brake() {
        System.out.println("Braking ...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
