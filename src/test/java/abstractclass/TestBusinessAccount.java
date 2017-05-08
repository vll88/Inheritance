package abstractclass;

import abstractclass.BusinessAccount;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by vilenalivinsky on 5/3/17.
 */
public class TestBusinessAccount {

    @Test
    public void getPINTest(){       //can name anything we want; method get from constructing obj and calling method on obj; see below in 'when'

        //Given
        BusinessAccount newAccount = new BusinessAccount(100, "kjg");
        String expectedResult = "kjg";

        //When
        String actualResult = newAccount.getPIN();

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void returnDoubleAccountBalanceTest(){

        //Given
        BusinessAccount newAccount = new BusinessAccount(100, "kjg");
        //When
        int randomTestNumber = 200;
        int expectedResult = randomTestNumber;
        int actualResult = newAccount.returnAccountBalanceDoubled();
        //Then
        Assert.assertEquals(expectedResult,actualResult);

    }


}

