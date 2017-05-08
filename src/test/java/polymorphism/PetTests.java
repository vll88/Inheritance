package polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class PetTests {

    @Test
    public void speakTest(){
        //Given
        Pet pet1 = new Pet("Pet1");
        String expectedResult = "noise";

        //When
        String actualResult = pet1.speak();

        //Then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void nameGetterTest(){
        //Given
        Pet pet1 = new Pet("Pet1");
        String expectedVal = "Pet1";

        //When
        String pet1Name = pet1.getName();

        //Then
        Assert.assertEquals("Pet1", pet1Name);
    }

    @Test
    public void nameGetterTestWithSetter() {
        Pet pet1 = new Pet("First pet");
        pet1.setName("Fluffy");

        String expected = "Fluffy";

        Assert.assertEquals(expected, pet1.getName());

    }


}