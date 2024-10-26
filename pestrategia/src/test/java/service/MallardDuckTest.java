package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MallardDuckTest {

    private MallardDuck d;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        d = new MallardDuck();
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
        assertTrue(out.toString().toLowerCase().contains("estoy volando"));
    }

    @Test
    public void testquack() {
        d.perfomSound();
        assertTrue(out.toString().toLowerCase().contains("quack"));
    }


    @Test
    public void testDisplay(){
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato silvestre"));
    }

    @Test
    public void testToString() {
        String esperado = "mallardduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}