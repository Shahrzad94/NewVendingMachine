package se.shjava.shahrzad.vendingmachine;

public class Product {

   private String name;
     private int price;
    private int productNumber;
     private String calories;

    public Product(String name, int price, int productNumber, String calories) {
        this.name = name;
        this.price = price;
        this.productNumber = productNumber;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getCalories() {
        return calories;
    }

    public String examin(){
     String info= "name = "+ " " +name+ " "+ "price= " + price+ " "
             + "pNumber= " + " " +productNumber+ " "
             + "calories=" + "  " + calories;
     return info;
    }

    public String use(int productNumber){
        String pInfo= "name"+ " "+name+ " "+"pNumber"+ "  "+productNumber;
        return pInfo;
    }

    public String showProducts() {
        String info = //"Productnumber:"+" "+ productNumber+" "+
                //"Product name: " +
                        name;
        return info;
    }
}
