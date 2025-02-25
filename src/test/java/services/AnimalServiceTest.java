package services;

import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalServiceTest {
    private AnimalService animalService;
    private List<Animal> animales;

    @BeforeEach
    void setUp() {
        animalService = new AnimalService();
        animales = Arrays.asList(
                new Perro("Dobbye"),
                new Aguila("Aguila Real"),
                new Pez("Nemo")
        );
    }

    @Test
    void testAgruparPorTipo() {
        Map<TipoAnimal, List<Animal>> resultado = animalService.agruparPorTipo(animales);

        assertNotNull(resultado);
        assertEquals(3, resultado.size());
        assertTrue(resultado.containsKey(TipoAnimal.TERRESTRE));
        assertTrue(resultado.containsKey(TipoAnimal.VOLADOR));
        assertTrue(resultado.containsKey(TipoAnimal.ACUATICO));
    }

    @Test
    void testListaVacia(){
        Map<TipoAnimal, List<Animal>> resultado = animalService.agruparPorTipo(new ArrayList<>());
        assertTrue(resultado.isEmpty());
    }

}
