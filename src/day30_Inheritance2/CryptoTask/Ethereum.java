package day30_Inheritance2.CryptoTask;

public class Ethereum extends CryptoToken{

    public Ethereum(double price, int quantity, long marketCap, long volume, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
