package se.su.ovning1;

import java.util.ArrayList;



public class Order {

    private final long orderNumber = 0;
    private static long counter;
    private final ArrayList<Item> items;

    public Order(Item... inputItems){

        items = new ArrayList<Item>();
        for (Item i : inputItems){
            items.add(i);
        }

        counter++;
    }

    public String getReceipt() {
        String receipt = "Receipt for order #" + counter + "\n" + "-----------\n";
        for (Item i : items) {
            receipt = receipt + i.toString() + "\n";
        }
        receipt += "Total excl. VAT: " + getTotalValue() + "\n";
        receipt += "Total incl. VAT: " + getTotalValuePlusVAT() + "\n";
        receipt += "----------\n";
        return receipt;
    }


    public double getTotalValuePlusVAT(){
        double totalValue = 0;

        for(Item i : items){
            totalValue += i.getPriceWithVAT();
        }

        return totalValue;

    }

    public double getTotalValue(){
        double totalValue = 0;

        for(Item i : items){
            totalValue += i.getPrice();
        }

        return totalValue;

    }


}
