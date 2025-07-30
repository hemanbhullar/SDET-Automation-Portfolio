public class Motorcycle extends Vehicle {

    @Override
    void drive() {
        System.out.println("Drive");
    }

    @Override
    public void honk() {
        System.out.println("ping ping!");
    }

    public void doWheelie() {
        System.out.println("Doing a cool wheelie!");
    }
}

