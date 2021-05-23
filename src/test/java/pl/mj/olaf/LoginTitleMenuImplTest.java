package pl.mj.olaf;

import org.junit.jupiter.api.Test;
import pl.mj.olaf.menu.LoginMenu;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginMenuTest {

    @Test
    public void shouldReturnTrueIfUserChoice1(){
        LoginMenu loginMenu = new LoginMenu();

        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(true, loginMenu.getMenuChoice());
    }

    @Test
    public void shouldReturnFalseIfUserChoice0(){
        LoginMenu loginMenu = new LoginMenu();

        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(false, loginMenu.getMenuChoice());
    }
}
