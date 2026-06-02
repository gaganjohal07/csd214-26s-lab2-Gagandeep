package bookstore;

import bookstore.pojos.GamingMouse;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAppFlow_AddGamingMouse() {

        StringBuilder script = new StringBuilder();

        script.append("1\n"); // main menu -> Add Items
        script.append("6\n"); // add Gaming Mouse

        script.append("Logitech\n"); // brand
        script.append("1600\n"); // dpi

        script.append("99\n"); // exit add menu
        script.append("99\n"); // quit app

        System.setIn(
                new ByteArrayInputStream(
                        script.toString().getBytes()
                )
        );

        App app = new App();

        app.run();

        GamingMouse expectedMouse =
                new GamingMouse("Logitech", 1600);

        assertNotNull(
                app.findItem(expectedMouse)
        );
    }
}