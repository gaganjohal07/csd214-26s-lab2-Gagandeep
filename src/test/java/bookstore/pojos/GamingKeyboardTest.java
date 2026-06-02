package bookstore.pojos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GamingKeyboardTest {

    @Test
    void testEquality() {

        GamingKeyboard keyboard1 =
                new GamingKeyboard("Razer", "Mechanical");

        GamingKeyboard keyboard2 =
                new GamingKeyboard("Razer", "Mechanical");

        GamingKeyboard keyboard3 =
                new GamingKeyboard("Logitech", "Membrane");

        assertEquals(keyboard1, keyboard2);

        assertNotEquals(keyboard1, keyboard3);
    }

    @Test
    void testConstructor() {

        GamingKeyboard keyboard =
                new GamingKeyboard("Razer", "Mechanical");

        assertEquals("Razer", keyboard.getBrand());

        assertEquals(
                "Mechanical",
                keyboard.getSwitchType()
        );
    }

    @Test
    void testSellItem() {

        GamingKeyboard keyboard =
                new GamingKeyboard("Razer", "Mechanical");

        keyboard.sellItem();

        assertEquals(0, keyboard.getPrice());
    }
}