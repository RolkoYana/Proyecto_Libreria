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
    void testAagregarCopias() {
        assertTrue(libro1.agregarCopias(2) > 0); //test que num de copias a agregar debe ser mayor a 0
    }

    @Test
    void testEliminarCopiasTest() {
        assertTrue(libro1.eliminarCopias(3) <= libro1.getNumeroCopias()); //test que el numero de copias que quedan despues de eliminar es menor al numero de copias que habia
    }
}