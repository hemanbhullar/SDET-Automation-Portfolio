public class Truck extends Vehicle {

    private double cargoCapacity = 200;

    void drive() {
        System.out.println("GuuGuu");
    }

    double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void honk() {
        System.out.println("Pika Pika!");
    }
}
