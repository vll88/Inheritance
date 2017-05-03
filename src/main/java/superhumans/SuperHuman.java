package superhumans;
import static java.lang.Boolean.TRUE;

/**
 * Created by vilenalivinsky on 5/3/17.
 */


public class SuperHuman extends Human {

    boolean GoodSuperHuman = true;
    String HeroName = "kindaCoder";
    String SuperAbility = "kinda maybe code";

    public SuperHuman()//redundant constructor
    {
        System.out.println("Building SuperHuman--redundant constructor");
    }

    public boolean getGoodSuperHuman() {
        return GoodSuperHuman;
    }

    public String getHeroName() {
        return HeroName;
    }

    public String getSuperAbility() {
        return SuperAbility;
    }
}

