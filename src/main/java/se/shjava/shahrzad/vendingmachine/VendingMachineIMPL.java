package se.shjava.shahrzad.vendingmachine;

public class VendingMachineIMPL implements VendingMachine {


    private Product products[];
    private int moneyPool;

    public VendingMachineIMPL(Product[] product) {
        this.products = product;
        this.moneyPool = 0;
    }

     @Override
    public void addCurrency(int amount) {
        int[] acceptedCurrency= {1,5,10,20,50,100,500,1000};
        for( int currency: acceptedCurrency){
            if(currency==amount){
                moneyPool+=amount;
                break;
            }

        }

    }
    private Product findProduct(int productNumber){  ///
        for(Product product:products ){
            if(product.getProductNumber()==productNumber){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product request(int productNumber) {
        Product product= findProduct(productNumber);

        {     if(product.getPrice()>moneyPool){
                return null;
            }
            moneyPool-= product.getPrice();
            return product;
        }}

    @Override
    public int endSession() {
        int change= moneyPool;
        moneyPool=0;
        return change;
    }

    @Override
    public String getDescription(int productNumber) {
        Product product= findProduct(productNumber);
        if(product==null){
            System.out.println("Can not find product");
        }
        return product.examin();
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }

    @Override
    public String[] getProducts() {  //
   String[] showProduct = new String[products.length];

        for(int i = 0; i < products.length; i++){
            showProduct[i] = products[i].showProducts();
        }
        return showProduct;
    }
}
