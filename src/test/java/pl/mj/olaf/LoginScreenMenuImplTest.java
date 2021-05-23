package pl.mj.olaf;

import org.junit.jupiter.api.Test;
import pl.mj.olaf.menu.LoginMenuImpl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTitleMenuImplTest {

    @Test
    public void shouldReturnTrueIfUserChoice1(){
        LoginMenuImpl loginMenuImpl = new LoginMenuImpl();

        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(true, loginMenuImpl.getMenuChoice());
    }

    @Test
    public void shouldReturnFalseIfUserChoice0(){
        LoginMenuImpl loginMenuImpl = new LoginMenuImpl();

        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(false, loginMenuImpl.getMenuChoice());
    }
}
