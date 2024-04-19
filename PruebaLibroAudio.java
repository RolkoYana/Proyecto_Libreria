import java.util.ArrayList;
import java.util.List;

public class PruebaLibroAudio {
    public static void main(String[] args) {
        List<LibroAudio> libros = new ArrayList<>();

        LibroAudio libro = new LibroAudio("Juan el carpintero","Juana","Accion",10,15,"español","alta");
        libros.add(libro);
        LibroAudio libro1 = new LibroAudio("Juan el fontanero","Juan","Accion",10,10,"ingles","baja");
        libros.add(libro1);

        for (LibroAudio l : libros) {
            System.out.println(l);
        }
    }
}