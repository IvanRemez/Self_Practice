package day34_Interface.DeviceTask;

public class DeviceShop {

    public static void main(String[] args) {

        iPhone iPhone = new iPhone("Apple","12 mini","Small",800,"Gray",true,true);

        System.out.println(iPhone);

        iPhone.call(1234567);
        iPhone.turnOn();
        iPhone.text(1234567);
        iPhone.turnOff();
        iPhone.downloadApp();

    }
}
