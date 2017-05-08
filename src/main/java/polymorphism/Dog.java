package polymorphism;

/**
 * Created by vilenalivinsky on 5/5/17.
 */
public class Dog extends Pet{

    private String name;

    public Dog(String name){

        super(name);
    }

    @Override
    public String speak(){

        return "Woof";
    }
}
