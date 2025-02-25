package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AguilaTest {
    @Test
    void testAguilaHacerSonido(){
        Aguila aguila= new Aguila("Aguila Real");
        assertEquals("Caaa",aguila.hacerSonido());
    }

    @Test
    void testAguilaEsVoladora(){
        Aguila aguila= new Aguila("Fenix");
        assertTrue(aguila.esVolador());
        assertFalse(aguila.esTerrestre());
        assertFalse(aguila.esAcuatico());
    }

}
