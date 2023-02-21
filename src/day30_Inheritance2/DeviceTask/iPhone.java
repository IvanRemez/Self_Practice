package day30_Inheritance2.DeviceTask;

public class iPhone extends Phone{

    public iPhone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void faceTime(long number){
        System.out.println(getModel() + " is FaceTiming " + number);
    }
}
