package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class QuackTest {

    private Quack d;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        d = new Quack();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream( out ));
    }

    @Test
    public void makeSound() {
        d.makeSound();
        assertTrue(out.toString().toLowerCase().contains("quack"));
    }

    @Test
    public void testToString() {
        String esperado = "quack{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}