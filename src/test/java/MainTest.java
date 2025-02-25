
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class MainTest {

    @Test
    void testEntradaValida() {
        String[] args = {"Firulais|TERRESTRE|Guau", "Sky|VOLADOR|Caaa", "Nemo|ACUATICO|Glub"};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(args);

        String salida = outputStream.toString();
        assertTrue(salida.contains("Tipo: TERRESTRE"));
        assertTrue(salida.contains("Firulais hace Guau"));
        assertTrue(salida.contains("Tipo: VOLADOR"));
        assertTrue(salida.contains("Sky hace Caaa"));
        assertTrue(salida.contains("Tipo: ACUATICO"));
        assertTrue(salida.contains("Nemo hace Glub"));
    }

    @Test
    void testEntradaInvalida() {
        String[] args = {"Gato|DESCONOCIDO|Miau"};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(args);

        String salida = outputStream.toString();
        assertTrue(salida.contains("Tipo de animal inválido: DESCONOCIDO"));
    }

    @Test
    void testSinArgumentos() {
        String[] args = {};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(args);

        String salida = outputStream.toString();
        assertTrue(salida.contains("Por favor, ingrese los animales en el formato"));
    }
}
