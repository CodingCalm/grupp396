package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25{

    private final String artist;
    private final int year;
    private int condition;
    private final double price;


    protected Recording(String name, String artist, int year, int condition, double price){
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist(){
        return artist;
    }

    public abstract String getType();

    public int getCondition(){
        return condition;
    }

    public double getPrice() {
        double reducedPrice = this.price * (this.condition / 10.0);

        if (reducedPrice < 10.0) {
            reducedPrice = 10.0;
        }
        return reducedPrice;

    }

    public String toString(){
        return getType() + "name" + getName() + " artist " + artist + "year" + getYear() +
                " condition: " + condition + "original price: " + getOriginalPrice() + " price: " + getPrice() + " price+VAT: " + getPriceWithVAT();
    }

    public int getYear(){
        return year;
    }

    protected double getOriginalPrice(){
        return price;
    }

}
