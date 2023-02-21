package day34_Interface.DeviceTask;

public class Computer extends Device{

    public Computer(String brand, String model, String size, double price, String color,
                    boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    protected void turnOn() {
        System.out.println("Press power button to turn on " + getBrand() + " " + getModel());
    }

    @Override
    protected void turnOff() {
        System.out.println("Press power button to turn off " + getBrand() + " " + getModel());
    }
}
