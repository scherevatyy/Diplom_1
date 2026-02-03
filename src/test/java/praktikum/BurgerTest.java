package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BurgerTest {

    @Test
    public void shouldSetBunsCorrectly() {
        Bun bun = mock(Bun.class);

        Burger burger = new Burger();
        burger.setBuns(bun);

        assertEquals(bun, burger.bun);
    }

    @Test
    public void shouldAddIngredient() {
        Ingredient ingredient = mock(Ingredient.class);

        Burger burger = new Burger();
        burger.addIngredient(ingredient);

        assertEquals(1, burger.ingredients.size());
        assertEquals(ingredient, burger.ingredients.get(0));
    }

    @Test
    public void shouldCalculateCorrectPrice() {
        Bun bun = mock(Bun.class);
        Ingredient ingredient = mock(Ingredient.class);

        when(bun.getPrice()).thenReturn(100f);
        when(ingredient.getPrice()).thenReturn(50f);

        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        float actualPrice = burger.getPrice();

        assertEquals(250f, actualPrice, 0.0);
    }

    @Test
    public void shouldRemoveIngredientByIndex() {
        Ingredient ingredient = mock(Ingredient.class);

        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);

        assertEquals(0, burger.ingredients.size());
    }

    @Test
    public void shouldMoveIngredient() {
        Ingredient first = mock(Ingredient.class);
        Ingredient second = mock(Ingredient.class);

        Burger burger = new Burger();
        burger.addIngredient(first);
        burger.addIngredient(second);

        burger.moveIngredient(0, 1);

        assertEquals(second, burger.ingredients.get(0));
        assertEquals(first, burger.ingredients.get(1));
    }

    @Test
    public void shouldReturnCorrectReceipt() {
        Bun bun = mock(Bun.class);
        Ingredient ingredient = mock(Ingredient.class);

        when(bun.getName()).thenReturn("Black bun");
        when(bun.getPrice()).thenReturn(100f);

        when(ingredient.getType()).thenReturn(IngredientType.SAUCE);
        when(ingredient.getName()).thenReturn("Spicy sauce");
        when(ingredient.getPrice()).thenReturn(50f);

        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        String receipt = burger.getReceipt();

        assertTrue(receipt.contains("Black bun"));
        assertTrue(receipt.contains("Spicy sauce"));
        assertTrue(receipt.contains("250"));
    }
}