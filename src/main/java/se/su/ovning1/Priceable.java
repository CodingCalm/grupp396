package se.su.ovning1;

public interface Priceable {
    public double getPrice();
    public double getVAT();

    public default double getPriceWithVAT(){
        return getPrice() * getVAT();
    }

}
