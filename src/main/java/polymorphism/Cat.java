package polymorphism;

/**
 * Created by vilenalivinsky on 5/5/17.
 */
public class Cat extends Pet{


    public Cat(String name){

        super(name);
    }

    @Override
    public String speak(){

        return "Meow";
    }
}
