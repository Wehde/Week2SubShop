/**
 * @author Kilian Wehde - kewehde
 * CIS175 - Fall 2022
 * Sep 05, 2022
 */

package Tests;

import Model.Combo;
import Model.Sub;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCombo {
    Sub sub = new Sub("French", "Ham", "Cheddar", new String[]{"Lettuce", "Pickles"}, "Butter");
    Combo combo = new Combo("Wheat", "Turkey", "Colby Jack", new String[]{"Lettuce"}, "Mayo", "Cherry Coke", "Doritos");
    Combo combo2 = new Combo(sub, "Diet Coke", "Choc. Chip Cookie");

    @Test
    public void testConstructor1() {
        assertEquals(combo.getBread(), "Wheat");
    }
    @Test
    public void testConstructor2() {
        assertEquals(combo2.getBread(), "French");
    }
    @Test
    public void testMutable() {
        sub.setBread("White");
        assertNotEquals(combo2.getBread(), sub.getBread());
    }
}
