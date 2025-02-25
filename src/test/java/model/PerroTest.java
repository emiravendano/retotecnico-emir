package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerroTest {
    @Test
    void testPerroHacerSonido(){
        Perro perro= new Perro("Dobbye");
        assertEquals("Guau",perro.hacerSonido());
    }
    @Test
    void PerroEsTerrestre(){
        Perro perro= new Perro("Max");
        assertTrue(perro.esTerrestre());
        assertFalse(perro.esAcuatico());
        assertFalse(perro.esVolador());
    }

}
