package classmanager;

import java.util.ArrayList;

/**
 * Created by vilenalivinsky on 5/4/17.
 */
    public class Inventory {

     //member var being declared here
     //needs to be out of Inventory constructor below because will disappear once constructor is done instantiating--
     //instantiating it inside the constructor
    ArrayList<Product> products;

    public Inventory()
    {
        products = new ArrayList<Product>();    //constructs empty array of products; then can populate with add below
    }

    //adding products to empty array
    public void adding_products_fn (Product p){

        products.add(p);
    }

    /*
    //some Counter function of inventory for Test purposes--to see how tests work in general
    public int sum(ArrayList products){

        //some counter should be in fn
        return 4;
    }
*/
    public double inventory_valuefunction() {
        //Inventory value function: price * quantity
        double value = 0;
        for (int i = 0; i < products.size(); i++) {
            Product ithProduct = products.get(i);
            double price = ithProduct.getPrice();
            int quantity = ithProduct.getQuantity();
            value += price * quantity;
            System.out.println("The product is:" + products.get(i).getID() + "and its value is:" + value);
        }
        return value;
    }
    //Get index of product

}


/*

int array[] productarray;

int size = 3;
int[] productarray = new int[size];

for (int i = 0; i<productarray.length; i++){
    productarray[i];
}


 */