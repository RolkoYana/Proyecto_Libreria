import java.util.ArrayList;
import java.util.List;

public class PruebaLibroFisico {

    public static void main(String args[]){

        LibroFisico libro1 = new LibroFisico("Libro1", "Autor1", "Infantil", 9.95, "Planta 1");
        LibroFisico libro2 = new LibroFisico("Libro2", "Autor2", "Horror", 10.95, "Planta 2");
        LibroFisico libro3 = new LibroFisico("Libro3", "Autor3", "Detective", 15.95, "Planta 3");
        LibroFisico libro4 = new LibroFisico("Libro4", "Autor4", "Infantil", 11.20, "Planta 4");

        ArrayList<Libro> libros = new ArrayList<>();

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);

        for(Libro libro : libros){
            System.out.println(libro);
        }

        //metodos de la clase LibroFisico

        libro1.setUbicacion("planta 4");
        System.out.println("Modifico la ubicacion del libro 1.");
        System.out.println(libro1.toString()); //compruebo que se ha cambiado la ubicacion

        libro2.agregarCopias(4);
        System.out.println("El libro 2 tiene " + libro2.getNumeroCopias() + " copias.");
        System.out.println("El libro 1 tiene " + libro1.getNumeroCopias() + " copias.");

        libro2.eliminarCopias(2);
        System.out.println("El libro 2 tiene " + libro2.getNumeroCopias() + " copias.");

    }
}
