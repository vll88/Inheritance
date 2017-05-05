package abstractclass;

/**
 * Created by vilenalivinsky on 5/3/17.
 */
public abstract class Account {

    private double balance;
 //   private double deposit;

    public abstract String getPIN();

    public Account(double balance){

        this.balance = balance;
    }

    public double getBalance(){

        return balance;
    }

}
