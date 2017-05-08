package polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vilenalivinsky on 5/5/17.
 */
public class main_Pet {

    public static void main (String [] args){

    Pet pet1 = new Pet("Pet1");
    System.out.println(pet1.speak());
    Bird pet2 = new Bird("Pet2");
    System.out.println(pet2.speak());
    Dog pet3 = new Dog("Pet3");
    System.out.println(pet3.speak());
    Cat pet4 = new Cat("Pet4");
    System.out.println(pet4.speak());

    }



}
