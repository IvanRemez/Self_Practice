package day34_Interface.DeviceTask;

public class Samsung extends Phone implements Downloadable, AndroidApps{

    public Samsung(String brand, String model, String size, double price, String color,
                   boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading app from the " + AppStoreName);
    }
}

