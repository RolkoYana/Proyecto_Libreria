import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaLibroElectronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<LibroElectronico> libros = new ArrayList<>();

        LibroElectronico libro = new LibroElectronico();
        libro.setAutor("juan");
        libro.setGenero("accion");
        libro.setPrecio(121313);
        libro.setTitulo("Penelope");
        libro.setFormato("apple");
        libro.verificarCompatibilidadDispositivo("samsung", scanner);
        //libro.convertirAFormato(scanner);
        libros.add(libro);
    }
}
