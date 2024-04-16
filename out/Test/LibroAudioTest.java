import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroAudioTest {



    @Test
    void calcularTasaBitAltaTest() {
        LibroAudio libro = new LibroAudio("Juan el carpintero","Juana","Accion",10,15,"español");
        assertEquals(12, libro.calcularTasaBitsAlta());
    }

    @Test
    void calcularTasaBitBajaTest() {
        LibroAudio libro = new LibroAudio("Juan el carpintero","Juana","Accion",10,15,"español");
        assertEquals(18, libro.calcularTasaBitsBaja());
    }
}