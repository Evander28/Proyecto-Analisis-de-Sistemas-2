package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ModelDuckTest {
    private ModelDuck d;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        d = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testmakeSound() {
        d.perfomSound();
        assertTrue(out.toString().toLowerCase().contains("sin sonido"));
    }

    @Test
    public void setChangeFlyBehavior() {
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar"));
        d.setFlyBehavior(new FlyLikeRocket());
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("volar como cohete"));

    }

    @Test
    public void testDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("pato de modelo"));
    }

    @Test
    public void testToString() {
        String esperado = "modelduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}