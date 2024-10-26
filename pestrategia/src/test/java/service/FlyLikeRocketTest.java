package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyLikeRocketTest {

    private FlyLikeRocket d;
    private ByteArrayOutputStream out;



    @Before
    public void before() throws Exception {
        d = new FlyLikeRocket();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void fly() {
        d.fly();
        assertTrue(out.toString().toLowerCase().contains("volar como cohete"));
    }

    @Test
    public void testToString() {
        String esperado = "flylikerocket{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}