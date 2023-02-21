package day34_Interface.DeviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, String size, double price, String color,
                 boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting " + phoneNum);
    }

    @Override
    protected void turnOn() {
        System.out.println("Press power button to turn on " + getBrand() + " " + getModel());
    }

    @Override
    protected void turnOff() {
        System.out.println("Press power button to turn off " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
