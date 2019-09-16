package se.shjava.shahrzad;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.shjava.shahrzad.vendingmachine.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private VendingMachineIMPL testObject;
    private Product cocaCola;
    private Product Snacks;
    private Product apple;
    @Before
    public void setUp(){
        cocaCola= new Drinks("cocaCola", 20, 1,"no");
        Snacks= new Snacks("popcorn", 10, 2, "fatt");
        apple= new Fruits("Apple", 15, 3, "socker");
        Product[] testProducts = {cocaCola, Snacks, apple};
        int i=0;
        testObject = new VendingMachineIMPL(testProducts);
    }
    @Test
    public void testAddMoney(){
        int expected = 100;
        testObject.addCurrency(100);
        int actual = testObject.getBalance();
        Assert.assertEquals(expected ,actual);
    }
    @Test
    public void testRequest(){
        testObject.addCurrency(100);
        int productNumber = 1;
        Product expected = cocaCola;
        Product actual = testObject.request(productNumber);
        Assert.assertEquals(expected ,actual);
    }
    @Test
    public void testEndSession(){
        testObject.addCurrency(1000);
        int expected = 1000;
        int actual = testObject.endSession();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetDescription(){
        int productNumber = 1;
        String expected = "name =  cocaCola price= 20 pNumber=  1 calories=  no";
        String actual = testObject.getDescription(productNumber);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetProducts() {
        String[] expected = {"cocaCola", "popcorn", "Apple"};
        String[] actual = testObject.getProducts();
        Assert.assertArrayEquals(expected, actual);
    }
public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}