import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroFisicoTest {

    LibroFisico libro1;

    @BeforeEach
    public void setUp(){
        libro1 = new LibroFisico("Libro1", "Autor1", "Infantil", 9.95, "Planta 1");
    }

    @Test
    void agregarCopiasTest() {
    }

    @Test
    void eliminarCopiasTest() {
    }
}