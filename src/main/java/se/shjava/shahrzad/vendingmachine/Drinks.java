package se.shjava.shahrzad.vendingmachine;

public class Drinks extends Product {
    public Drinks(String name, int price, int productNumber, String calories) {
        super(name, price, productNumber, calories);
    }

    @Override
    public String use(int productNumber) {
        return super.use(productNumber);
    }
}
