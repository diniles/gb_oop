package seminar1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTest {


    @Test
    void testOfCreation() {
        Animal first = new Animal("first");
        Animal second = new Animal("second", 1, 3, 22);
        Animal third = new Animal("first");
        Animal fourth = new Animal();

        Assertions.assertEquals("first", first.getName());

        Assertions.assertEquals("second", second.getName());
        Assertions.assertEquals(1, second.getAge());
        Assertions.assertEquals(3, second.getWeight());
        Assertions.assertEquals(22, second.getHeight());

        Assertions.assertNotEquals("first", third.getName());
        Assertions.assertNotEquals("first", fourth.getName());
    }
}