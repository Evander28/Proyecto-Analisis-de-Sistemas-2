package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DecoyDuckTest {

    private DecoyDuck d;
    private ByteArrayOutputStream out;


    @Before
    public void before() throws Exception {
        d = new DecoyDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream( out ));
    }

    @Test
    public void testSwim() {
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }

    @Test
    public void testFly() {
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar"));
    }
    @Test
    public void testquack() {
        d.perfomSound();
        assertTrue(out.toString().toLowerCase().contains("sin sonido"));
    }


    @Test
    public void testDisplay(){
        d.display();
        assertTrue(out.toString().toLowerCase().contains("Soy un Pato de Caza"));
    }
    @Test
    public void testToString() {
        String esperado = "decoyduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

}