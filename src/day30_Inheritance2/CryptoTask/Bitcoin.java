package day30_Inheritance2.CryptoTask;

public class Bitcoin extends CryptoToken{

    public Bitcoin(double price, int quantity, long marketCap, long volume, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }

}
