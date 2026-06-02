package bookstore.pojos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GamingMouseTest {

    @Test
    void testEquality() {

        GamingMouse mouse1 = new GamingMouse("Logitech", 1600);
        GamingMouse mouse2 = new GamingMouse("Logitech", 1600);
        GamingMouse mouse3 = new GamingMouse("Razer", 800);

        assertEquals(mouse1, mouse2);
        assertNotEquals(mouse1, mouse3);
    }

    @Test
    void testConstructor() {

        GamingMouse mouse = new GamingMouse("Logitech", 1600);

        assertEquals("Logitech", mouse.getBrand());
        assertEquals(1600, mouse.getDpi());
    }

    @Test
    void testSellItem() {

        GamingMouse mouse = new GamingMouse("Logitech", 1600);

        mouse.sellItem();

        assertEquals(0, mouse.getPrice());
    }
}