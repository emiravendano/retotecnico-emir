package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PezTest {
    @Test
    void testPezHacerSonido() {
        Pez pez= new Pez("Nemo");
        assertEquals("Glub",pez.hacerSonido());
    }

    @Test
    void PezEsAcuatico() {
        Pez pez= new Pez("Dory");
        assertTrue(pez.esAcuatico());
        assertFalse(pez.esVolador());
        assertFalse(pez.esTerrestre());
    }
}
