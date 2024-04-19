import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroAudioTest {
    LibroAudio libro, libro1;

    @BeforeEach
    void setUp() {
        libro = new LibroAudio("Juan el carpintero", "Juana", "Accion", 10, 15, "español","alta");
        libro1 = new LibroAudio("Juan el fontanero","Juan","Accion",10,10,"ingles","baja");
    }

    @Test
    void calcularTasaBitAltaTest() {
        assertEquals(12, libro.calcularTasaBitsAlta());
    }

    @Test
    void calcularTasaBitBajaTest() {
        assertEquals(12, libro1.calcularTasaBitsBaja());
    }

    @AfterAll //solo los all son static, instanciar un sola vez
    public static void terminarTests() {
        System.out.println("Tests terminados");
    }
}