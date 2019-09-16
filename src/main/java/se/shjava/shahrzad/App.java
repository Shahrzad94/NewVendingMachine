package se.shjava.shahrzad;

import se.shjava.shahrzad.vendingmachine.Drinks;
import se.shjava.shahrzad.vendingmachine.Product;

/**
 * Hello world!
 *
 */
public class App 
{
        public static void main( String[] args ) {
        Product cocaCola = new Drinks("cocaCola", 20, 1, "no");
       Product fanta = new Drinks("fanta", 5, 1, "fatt");
            System.out.println(cocaCola.examin());
            System.out.println(cocaCola.getPrice());
            System.out.println(cocaCola.getProductNumber());
            System.out.println(cocaCola.showProducts());
            System.out.println(cocaCola.use(1));
    }
    }

