package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SqueakTest {

    private Squeak d;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        d = new Squeak();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream( out ));
    }

    @Test
    public void makeSound() {
        d.makeSound();
        assertTrue(out.toString().toLowerCase().contains("squeak"));
    }

    @Test
    public void testToString() {
        String esperado = "squeak{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}