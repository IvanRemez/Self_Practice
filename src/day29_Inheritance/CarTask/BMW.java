package day29_Inheritance.CarTask;

public class BMW extends Car{

    public static void main(String[] args) {

        Car bae = new Car();

        bae.setInfo("BMW","M3","Black",2025,200000);
        System.out.println(bae);
    }
}
