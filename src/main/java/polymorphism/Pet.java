package polymorphism;
import java.lang.Comparable;
/**
 * Created by vilenalivinsky on 5/5/17.
 */
    public class Pet {

    //var members
    private String name;

    //Constructor
    public Pet(String pet1) {

      this.name = pet1;
      System.out.println(this.name);
    }

    //methods
    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    //make different in each of subclasses!
    //can call on particularly this output in subclass via: 'super.'
    public String speak(){
        return "Main pet noise";
    }

    /*
    public String toString(){

        String s = "Pet name:"+name;
        return s;
    }


   // public int Array.sort(){


    }
    */

}
