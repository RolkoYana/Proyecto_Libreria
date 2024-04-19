import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LibroElectronicoTest {

        private LibroElectronico libro;
        private Scanner scanner;

        @BeforeEach
        public void setUp() {
            libro = new LibroElectronico("Formato1");
            scanner = new Scanner(System.in);
        }

        @AfterEach
        public void tearDown() {
            scanner.close();
        }

    @Test
    void verificarCompatibilidadDispositivoTest() {
        Scanner sc = new Scanner(new ByteArrayInputStream("Dispositivo1\nFormato1".getBytes()));
        assertTrue(libro.verificarCompatibilidadDispositivo("Dispositivo1", sc));
        sc = new Scanner(new ByteArrayInputStream("Dispositivo2\nFormato2".getBytes()));
        assertFalse(libro.verificarCompatibilidadDispositivo("Dispositivo1", sc));
    }

    @Test
    void convertirAFormatoTest() {
        libro.convertirAFormato("Formato1");
        assertEquals("Formato1", libro.getFormato());
        libro.convertirAFormato("Formato2");
        assertEquals("Formato2", libro.getFormato());
    }
    @AfterAll
    public static void cleanUp() {
        System.out.println("Test terminados con exito");
    }
}