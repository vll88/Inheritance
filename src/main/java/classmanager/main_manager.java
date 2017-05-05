package classmanager;

import java.util.ArrayList;

/**
 * Created by vilenalivinsky on 5/3/17.
 */
public class main_manager {

    public static void main(String[] args) {

        Inventory products = new Inventory();
//        products.add(new Product("xx001product",20.0,4)); //just an example of .add for myself

        Product product001 = new Product("xx001product",20.0,4);
        Product product002 = new Product("xx002product",40.0,1);
        System.out.println(product001.getID());
        products.adding_products_fn(product001);
        System.out.println(product002.getID());
        products.adding_products_fn(product002);
     //   System.out.println(products.size());

        products.inventory_valuefunction();

    }
}
