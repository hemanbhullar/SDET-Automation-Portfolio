public abstract class Vehicle {
    String brand = "Generic Brand";

    abstract void drive();

    public void honk() {
        System.out.println("Beep Beep!");
    }
}

