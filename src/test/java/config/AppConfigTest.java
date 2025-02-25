package config;

import model.Animal;
import model.Perro;
import model.Aguila;
import model.Pez;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

class AppConfigTest {

    @Test
    void testBeansCreadosCorrectamente() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Animal perro = context.getBean("perro", Animal.class);
        Animal aguila = context.getBean("aguila", Animal.class);
        Animal pez = context.getBean("pez", Animal.class);

        assertNotNull(perro);
        assertNotNull(aguila);
        assertNotNull(pez);

        assertEquals("Bobby", perro.getNombre());
        assertEquals("Águila Real", aguila.getNombre());
        assertEquals("Nemo", pez.getNombre());
    }
}
