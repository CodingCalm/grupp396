package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6{

    private final double price;
    private final boolean bound;
    private final String author;

    public Book (String name, String author, double price, boolean bound){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public double getVAT() {
        return 6;
    }

    @Override
    public double getPriceWithVAT() {
        return price * (1 + getVAT());
    }

    // Override toString() for Book-specific representation
    @Override
    public String toString() {
        return getName() + author + price + bound;
    }
}
