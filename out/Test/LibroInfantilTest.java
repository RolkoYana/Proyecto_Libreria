import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LibroInfantilTest {
    @Test
    void mostrarIlustraciones() {
        LibroInfantil li = new LibroInfantil(11, true, 12);         //aqui deberiamos poder añadir un libro
        li.mostrarIlustraciones(12); //y aqui poder ver si se han añadido ilustraciones arriba o no
        //assertTrue(true);
    }

    @Test
    void verificarEdadApta() {
    }
}