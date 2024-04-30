import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LibroElectronicoTest {

        private LibroElectronico libro;

        @BeforeEach
        public void setUp() {
            libro = new LibroElectronico("pdf");
        }

    @Test
    public void verificarCompatibilidadDispositivoTest() {
        assertTrue(libro.verificarCompatibilidadDispositivo("movil"));
        assertTrue(libro.verificarCompatibilidadDispositivo("tablet"));
        assertTrue(libro.verificarCompatibilidadDispositivo("ebook"));
        assertFalse(libro.verificarCompatibilidadDispositivo("ordenador"));
        assertFalse(libro.verificarCompatibilidadDispositivo("telefono"));
    }

    @Test
    void convertirAFormatoTest() {
        libro.convertirAFormato("epub");
        assertEquals("epub", libro.getFormato());
        libro.convertirAFormato("txt");
        assertEquals("txt", libro.getFormato());
    }
    @AfterAll
    public static void cleanUp() {
        System.out.println("Test terminados con exito");
    }
}
