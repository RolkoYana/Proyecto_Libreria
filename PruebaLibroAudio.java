import java.util.ArrayList;
import java.util.List;

public class PruebaLibroAudio {
    public static void main(String[] args) {
        List<LibroAudio> libros = new ArrayList<>();

        LibroAudio libro = new LibroAudio("Juan el carpintero","Juana","Accion",10,15,"español");
        libros.add(libro);
        System.out.println(libros);
    }
}