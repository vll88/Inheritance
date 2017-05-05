package classmanager;

import java.util.ArrayList;

/**
 * Created by vilenalivinsky on 5/4/17.
 */
public class Product {

    private String ID;
    private double price;
    private int quantity;

    public Product() {

        System.out.println("This is a note for myself: building Product");
    }

    public Product(String ID, double price, int quantity) {

        this.ID = ID;
        this.price = price;
        this.quantity = quantity;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
/*

int array[] productarray;

int size = 3;
int[] productarray = new int[size];

for (int i = 0; i<productarray.length; i++){
    productarray[i];
}


 */


}
