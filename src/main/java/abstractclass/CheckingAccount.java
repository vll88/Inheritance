package abstractclass;

/**
 * Created by vilenalivinsky on 5/3/17.
 */
public class CheckingAccount extends Account {

    private int PIN = 1234;

    public CheckingAccount (double balance){

        super(balance);
    }

    public String getPIN(){
        return String.format("Your Checking Account PIN:"+ PIN);
    }

}
