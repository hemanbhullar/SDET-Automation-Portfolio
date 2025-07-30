public class Main{
    public static void main(String[] args) {
        Motorcycle mybike = new Motorcycle();
        Vehicle newVehicle = new Vehicle() {
            @Override
            void drive() {

            }
        };
        mybike.drive();
        mybike.honk();
        newVehicle.honk();
        mybike.doWheelie();
        System.out.println("The brand is"+ mybike.brand);
    }
}
