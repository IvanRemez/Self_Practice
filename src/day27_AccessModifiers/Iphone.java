package day27_AccessModifiers;

public class Iphone {

    public static String brand, OS, madeIn, designedIn;
    public static boolean isSmartPhone;

    public String model, size, color;
    public int price;

    public Iphone(String model, String size, String color, int price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        brand = "Apple";
        OS = "iOS";
        madeIn = "China";
        designedIn = "California";
        isSmartPhone = true;
    }

    public void printOperatingSystem(){
        System.out.println(OS);
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model + " is texting " + phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println(model + " is FaceTiming " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model + " is FaceTiming " + email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", brand=" + brand +
                ", OS=" + OS +
                ", madeIn=" + madeIn +
                ", designedIn=" + designedIn +
                ", isSmartPhone=" + isSmartPhone +
                '}';
    }
}
/*
1. Create a class named Iphone

            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */