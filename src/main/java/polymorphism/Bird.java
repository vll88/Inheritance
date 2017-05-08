package polymorphism;

/**
 * Created by vilenalivinsky on 5/5/17.
 */
public class Bird extends Pet{

    //subclass automatically calls super constructor with no args, so must provide such empty constructor if
    //want Bird with no name, but we don't want that anyways
    public Bird (String name){

    //need to call super constructor and provide arg since super has such a constructor signature
    super (name);
    }

    @Override
    public String speak(){

        return "Chirp";
    }

}

//proving that Bird has everything that Pet has:getter,setter, and name!
class TestClass {
    public static void main(String[] args) {
        Bird someBird = new Bird("polly");
        String name = someBird.getName();
    }
}
