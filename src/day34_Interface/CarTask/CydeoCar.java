package day34_Interface.CarTask;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{

    public CydeoCar(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition to start "
                + getMake() + " " + getModel());
    }

    @Override
    protected void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has an AutoPark feature");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " has an AutoPilot feature");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " is able to fly");
    }
}
