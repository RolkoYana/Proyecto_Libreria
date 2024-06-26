import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibroInfantilTest {
    LibroInfantil l1, l2;
    @BeforeEach
    public void setUpInstance(){
        l1 = new LibroInfantil(11, true, 12);//aqui deberiamos poder añadir un libro
        l2 = new LibroInfantil(18, false, 0);
    }
    @BeforeEach
    public void iniciarTests(){
        System.out.println("test terminado, siguiente");
        //esto es para establecer el valor de variables que no queremos tener en duplicado en cada uno de los tests
    }

    @AfterAll //solo los all son static, instanciar un aunica vez
    public static void terminarTests(){
        System.out.println("Tests terminados");
    }
    @Test
    void testMostrarIlustraciones() {
        l1.mostrarIlustraciones(l1.numIlustraciones); //y aqui poder ver si se han añadido ilustraciones arriba o no
        //assertTrue(true);
    }

    @Test
    void testGetEdadRecomendada(){
        assertEquals(18,l2.getEdadRecomendada());
    } //aqui compruebo que realmente me devuelve mi edad recomendada anterior

    @Test
    void testVerificarEdadApta() {
        assertTrue(l1.verificarEdadApta(11));
    }
}