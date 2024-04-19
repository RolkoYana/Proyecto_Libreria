import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class LibroElectronicoTest {

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
    public void verificarCompatibilidadDispositivo_CasoExitoso() {
        Scanner sc = new Scanner(new ByteArrayInputStream("Dispositivo1\nFormato1".getBytes()));
        assertTrue(libro.verificarCompatibilidadDispositivo("Dispositivo1", sc));
    }

    @Test
    public void verificarCompatibilidadDispositivo_CasoFallido() {
        Scanner sc = new Scanner(new ByteArrayInputStream("Dispositivo2\nFormato2".getBytes()));
        assertFalse(libro.verificarCompatibilidadDispositivo("Dispositivo1", sc));
    }

    @Test
    public void convertirAFormato_MismoFormato() {
        libro.convertirAFormato("Formato1");
        assertEquals("Formato1", libro.getFormato());
    }

    @Test
    public void convertirAFormato_FormatoDiferente() {
        libro.convertirAFormato("Formato2");
        assertEquals("Formato2", libro.getFormato());
    }

    @AfterAll
    public static void cleanUp() {

    }
}
   // @BeforeEach se utiliza para inicializar el estado de las pruebas antes de ejecutar cada una.
   // @AfterEach se utiliza para limpiar recursos después de ejecutar cada prueba.
   // @AfterAll se utiliza para limpiar recursos una vez que se han ejecutado todas las pruebas.