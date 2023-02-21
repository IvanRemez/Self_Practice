package day29_Inheritance.PhoneTask;

public class Phone {

    private String brand, model, size, color;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand.isEmpty() || brand.isBlank() || brand == null){
            System.err.println("Brand cannot be null/empty/blank");
            System.exit(1);
        }
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if (model.isEmpty() || model.isBlank() || model == null){
            System.err.println("Model cannot be null/empty/blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if (color.isEmpty() || color.isBlank() || color == null){
            System.err.println("Color cannot be null/empty/blank");
            System.exit(1);
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0) {
            System.err.println("Price cannot be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public void setInfo(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public void call(long phoneNumber) {
        System.out.println(model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(model + " is texting " + phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will
					be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed
					in the print statement
 */