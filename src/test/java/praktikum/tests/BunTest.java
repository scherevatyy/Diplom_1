package praktikum.tests;

import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;
import static praktikum.constants.TestConstants.DELTA;

public class BunTest {

    @Test
    public void shouldReturnCorrectName() {
        Bun bun = new Bun("Brioche bun", 20);
        String actualName = bun.getName();
        assertEquals("Brioche bun", actualName);
    }

    @Test
    public void shouldReturnCorrectPrice() {
        Bun bun = new Bun("Brioche bun", 20);
        float actualPrice = bun.getPrice();
        assertEquals(20, actualPrice, DELTA);
    }
}