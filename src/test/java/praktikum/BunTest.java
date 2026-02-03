package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(20, actualPrice, 0.0);
    }
}