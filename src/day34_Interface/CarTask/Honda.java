package day34_Interface.CarTask;

public class Honda extends Car{

    public Honda(String model, int year, double price, String color) {
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
}
