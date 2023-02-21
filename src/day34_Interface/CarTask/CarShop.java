package day34_Interface.CarTask;

public class CarShop {

    public static void main(String[] args) {

        CydeoCar cydeoCar = new CydeoCar("Z1",2023,500000,"Machine");

        System.out.println(cydeoCar);

        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.stop();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();
    }
}
