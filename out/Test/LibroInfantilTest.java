import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibroInfantilTest {

    @BeforeEach
    public void iniciarTests(){
        System.out.println(":: beforeEach ::");
        //esto es para establecer el valor de variables que no queremos tener en duplicado en cada uno de los tests
        //miara yana!
        //
    }
    @Test
    void mostrarIlustraciones() {
        LibroInfantil li = new LibroInfantil(11, true, 12);//aqui deberiamos poder añadir un libro
        li.mostrarIlustraciones(12); //y aqui poder ver si se han añadido ilustraciones arriba o no
        //assertTrue(true);
    }

    @Test
    void getEdadRecomendada(){
        LibroInfantil l = new LibroInfantil(18, false, 0);
        assertEquals(18,l.getEdadRecomendada());
    } //aqui compruebo que realmente me devuelve mi edad recomendada anterior

    @Test
    void verificarEdadApta() {
    }
}