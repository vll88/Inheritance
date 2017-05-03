package superhumans;

/**
 * Created by vilenalivinsky on 5/3/17.
 */
public class main_superhumans {

    public static void main(String[] args) {


        //creating Human
        Human person1 = new Human();
        //getting info on Human
        System.out.println(person1.getName());
        System.out.println(person1.getGender());
        System.out.println(person1.getOccupation());
        System.out.println(person1.getAddress());

        //creating SuperHuman
        SuperHuman super1 = new SuperHuman();

        //getting info on SuperHuman
        System.out.println(super1.getGoodSuperHuman());
        System.out.println(super1.getHeroName());
        System.out.print(super1.getSuperAbility());

        System.out.println(super1.getName());

    }
}

