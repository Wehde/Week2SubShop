/**
 * @author Kilian Wehde - kewehde
 * CIS175 - Fall 2022
 * Sep 05, 2022
 */

package Tests;

import Model.Sub;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSub {
    Sub sub = new Sub("French", "Ham", "Cheddar", new String[]{"Lettuce", "Pickles"}, "Butter");
    Sub sub2 = new Sub();

    @Test
    public void testGetBread() {
        assertEquals(sub.getBread(), "French");
    }
    @Test
    public void testSetBread() {
        sub.setBread("Wheat");
        assertEquals(sub.getBread(), "Wheat");
    }
    @Test
    public void testNonNull() {
        assertNotNull(sub.getBread());
    }
    @Test
    public void testNull() {
        assertNull(sub2.getBread());
    }


}
