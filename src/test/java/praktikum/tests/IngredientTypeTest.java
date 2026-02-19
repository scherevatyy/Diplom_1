package praktikum.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.IngredientType;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final IngredientType expectedType;
    private final int expectedOrdinal;

    public IngredientTypeTest(IngredientType expectedType, int expectedOrdinal) {
        this.expectedType = expectedType;
        this.expectedOrdinal = expectedOrdinal;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {IngredientType.SAUCE, 0},
                {IngredientType.FILLING, 1}
        });
    }

    @Test
    public void shouldContainIngredientTypesInCorrectOrder() {
        IngredientType[] actualValues = IngredientType.values();
        assertEquals(expectedType, actualValues[expectedOrdinal]);
    }
}