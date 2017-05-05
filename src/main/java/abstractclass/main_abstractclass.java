package abstractclass;

/**
 * Created by vilenalivinsky on 5/3/17.
 */
public class main_abstractclass {

    public static void main (String [] args){

    //only BusinessAccount deployed right now
    Account[] accounts = new Account[3];

//    accounts[0] = new CheckingAccount(500.0);
//    accounts[1] = new BusinessAccount(100,"abc");
//    accounts[2] = new SavingsAccount(50000);

        for (Account acnt : accounts) {
            System.out.println(acnt.getBalance());

        }

    }
}
