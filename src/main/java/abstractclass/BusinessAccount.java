package abstractclass;

import org.junit.Before;

/**
 * Created by vilenalivinsky on 5/3/17.
 */
public class BusinessAccount extends Account {

    private String PIN;

    public BusinessAccount (double balance, String PIN) {

        super(balance);
        this.PIN = PIN;
    }

    public String getPIN(){

        return (PIN);
    }

    public int returnAccountBalanceDoubled(){

        return  (int) this.getBalance() * 2;
    }


}
