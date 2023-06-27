package seminar1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DogTest {

    Dog firstDog = new Dog("first dog", 3, 12, 35, "any", "cocker");

    @Test
    void ageInHumanYears() {
        Assertions.assertEquals(48, firstDog.getAgeInHumanYears());
    }
}