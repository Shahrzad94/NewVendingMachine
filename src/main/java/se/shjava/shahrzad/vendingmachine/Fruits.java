package se.shjava.shahrzad.vendingmachine;

public class Fruits extends Product {
    public Fruits(String name, int price, int productNumber, String calories) {
        super(name, price, productNumber, calories);
    }

    @Override
    public String use(int productNumber) {
        return super.use(productNumber);
    }
}
