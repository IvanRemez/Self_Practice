package day30_Inheritance2.DeviceTask;

public class Device {

    private String brand, model, color, size;
    private double price;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {

        if(brand == null){
            brand = "Unknown";
        }
        return brand;
    }

    public void setBrand(String brand) {

        if (brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand cannot be empty or blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {

        if(model == null){
            model = "Unknown";
        }
        return model;
    }

    public void setModel(String model) {

        if (model.isEmpty() || model.isBlank()){
            System.err.println("Model cannot be empty or blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){
            System.err.println("Price cannot be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }

    public void turnOn(){
        System.out.println(brand + " " + model + " turning on");
    }
}
