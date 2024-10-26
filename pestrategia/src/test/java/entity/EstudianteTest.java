package entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EstudianteTest {
    private Estudiante e;

    @Before
    public void before() throws Exception {
        e = new Estudiante( 18836, " Bryan Ramirez ");
    }

    @Test
    public void testMetodoToString() {
        String esperado = "estudiante{carnet=18836, nombre='bryan ramirez'}";
        String obtenido = e.toString().toLowerCase();
        assertEquals( esperado, obtenido );
    }
}