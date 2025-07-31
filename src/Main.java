public class Main{
    public static void main(String[] args) {
        Motorcycle mybike = new Motorcycle();
        Vehicle newVehicle = new Vehicle() {
            @Override
            void drive() {

            }
        };
        Truck newtruck = new Truck();
        newtruck.drive();
        newtruck.honk();
        System.out.println(newtruck.getCargoCapacity());
        mybike.drive();
        mybike.honk();
        newVehicle.honk();
        mybike.doWheelie();
        System.out.println("The brand is"+ mybike.brand);
    }
}
