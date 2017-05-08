package polymorphism;

import org.junit.Test;
//package io.zipcoder.pets;
import org.junit.Assert;

/**
 * Created by vilenalivinsky on 5/5/17.
 */
/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class DogTests {

    @Test
    public void speakTest() {
        //Given
        Dog pet1 = new Dog("Pet1");
        String expectedResult = "Woof";

        //When
        String actualResult = pet1.speak();

        //Then
        Assert.assertEquals(expectedResult, actualResult);

    }

}

