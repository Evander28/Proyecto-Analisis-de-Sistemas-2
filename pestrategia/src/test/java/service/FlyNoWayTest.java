package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyNoWayTest {

    private FlyNoWay d;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
            d = new FlyNoWay();
            out = new ByteArrayOutputStream();
            System.setOut(new PrintStream( out ));
    }

    @Test
    public void fly() {
        d.fly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar"));
    }

    @Test
    public void testToString() {
        String esperado = "flynoway{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}