import java.util.ArrayList;
import java.util.List;

public class Prueba {

    public static void main(String args[]){

        LibroFisico libro1 = new LibroFisico("Libro1", "Autor1", "Infantil", 9.95, "Planta 1");
        LibroFisico libro2 = new LibroFisico("Libro2", "Autor2", "Horror", 10.95, "Planta 2");
        LibroFisico libro3 = new LibroFisico("Libro3", "Autor3", "Detectiuve", 15.95, "Planta 3");
        LibroFisico libro4 = new LibroFisico("Libro4", "Autor4", "Infantil", 11.20, "Planta 4");

        List<Libro> libros = new ArrayList<>();

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);

        System.out.println(libros);

    }
}
