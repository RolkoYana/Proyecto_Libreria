import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    LibroFisico libro1;

    @BeforeEach
    public void setUp(){
        libro1 = new LibroFisico("Libro1", "Autor1", "Detective", 10.00, "Planta 1");
    }

    @Test
    void testCalcularPrecioConDescuento() {
        assertEquals(libro1.getPrecio(), libro1.calcularPrecioConDescuento(0));//test que si el descuento es 0%, devuelve el precio original
        assertTrue(libro1.calcularPrecioConDescuento(10) > 0); // test que el precio final con descuento debe ser mayor a 0
    }

}