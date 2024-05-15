import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroFisicoTest {

    LibroFisico libro1;

    @BeforeEach
    public void setUp(){
        libro1 = new LibroFisico("Libro1", "Autor1", "Infantil", 9.95, "Planta 1");
        libro1.setNumeroCopias(5);
    }

    @Test
    void agregarCopiasTest() {
        assertTrue(libro1.agregarCopias(2) > 0); //test que num de copias a agregar debe ser mayor a 0
        assertThrows(IllegalArgumentException.class, () ->{ //test que el numero de copia a agregar no puede ser <= 0
            libro1.agregarCopias(0);
        });
    }

    @Test
    void eliminarCopiasTest() {
        assertTrue(libro1.getNumeroCopias() >= libro1.eliminarCopias(3)); //test que la cantidad de copias ha reducido
        assertThrows(IllegalArgumentException.class, () ->{ //test que el numero de copias a eliminar no puede ser mayor que cantidad de copias existentes
            libro1.eliminarCopias(6);
        });

        assertThrows(IllegalArgumentException.class, ()->{ //test que el numero de copia a eliminar no puede ser <= 0
            libro1.eliminarCopias(0);
        });
    }
}