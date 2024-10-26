package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyWithWingsTest {

    private FlyWithWings d;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        d = new FlyWithWings();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream( out ));
    }

    @Test
    public void fly() {
        d.fly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando"));
    }

    @Test
    public void testToString() {
        String esperado = "flywithwings{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}