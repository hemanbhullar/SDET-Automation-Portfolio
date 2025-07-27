import java.util.Scanner;
public class Car {
    // Error 1: String literals must be in double quotes.
    private final String color = "black";
    private int speed;
    private boolean isEngineOn;

    public void startEngine() {
        this.isEngineOn = true;
        System.out.println("Engine has started.");
    }

    public void stopEngine() {
        this.isEngineOn = false;
        System.out.println("Engine has stopped.");
    }

    public void accelerate(int amount) {
        if (isEngineOn) {
            this.speed += amount; // It's better to increase speed, not just set it.
            System.out.println("Accelerating. Current speed: " + this.speed);
        } else {
            System.out.println("Cannot accelerate, engine is off.");
        }
    }

    public String getColor() {
        return this.color;
    }

    // Error 2: The main method must be "public static void".
    public static void main(String[] args){
        // You must create an object of the Car class to use its methods.
        Car myCar = new Car();

        System.out.println("The car color is: " + myCar.getColor());

        myCar.startEngine();

        System.out.println("Enter amount to accelerate by:");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        myCar.accelerate(amount);

        myCar.stopEngine();
    }
}