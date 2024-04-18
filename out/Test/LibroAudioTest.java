import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroAudioTest {
    LibroAudio libro;

    @BeforeEach
    void setUp() {
        libro = new LibroAudio("Juan el carpintero", "Juana", "Accion", 10, 15, "español");
    }

    @Test
    void calcularTasaBitAltaTest() {
        assertEquals(12, libro.calcularTasaBitsAlta());
    }

    @Test
    void calcularTasaBitBajaTest() {
        libro.setDuracion(10);
        assertEquals(12, libro.calcularTasaBitsBaja());
    }

    @AfterAll //solo los all son static, instanciar un sola vez
    public static void terminarTests() {
        System.out.println("Tests terminados");
    }
}