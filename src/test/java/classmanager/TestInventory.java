package classmanager;

import classmanager.Inventory;
import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by vilenalivinsky on 5/4/17.
 */
public class TestInventory {

    @Test

    public void testInventory_valuefunction() {

        //Given
        Inventory tracking = new Inventory();
 //       ArrayList<Product> exproducts = new ArrayList<Product>();
        tracking.adding_products_fn(new Product("xx001product", 1, 1));
        tracking.adding_products_fn(new Product("xx002product", 10.0, 2));
        double expectedVal = 21.0;

        //When
        double actualVal = tracking.inventory_valuefunction();

        //Then
        Assert.assertEquals(expectedVal, actualVal, 0.0);
    }

 /*
    @Test

    public void testSum (){

        //Given
        Inventory tracking = new Inventory();
        ArrayList<Product> exproducts = new ArrayList<Product>();
        exproducts.add(new Product("xx001product",20.0,4));
        exproducts.add(new Product("xx002product",40.0,8));


        //When(==if)
        int actual = tracking.sum(exproducts);

        //Then
        Assert.assertEquals(4,actual);
    }
*/

}
