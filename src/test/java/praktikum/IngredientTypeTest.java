package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IngredientTypeTest {

    @Test
    public void shouldContainSauceAndFillingInCorrectOrder() {
        IngredientType[] actualValues = IngredientType.values();

        IngredientType[] expectedValues = {
                IngredientType.SAUCE,
                IngredientType.FILLING
        };

        assertArrayEquals(expectedValues, actualValues);
    }
}