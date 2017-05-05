package abstractclass;

/**
 * Created by vilenalivinsky on 5/3/17.
 */
public class SavingsAccount extends Account {

    private String PIN = "123abc";

    public SavingsAccount (double balance){

        super(balance);
    }

    public String getPIN(){
        return ("Your Checking Account PIN:"+ PIN);
    }

}
