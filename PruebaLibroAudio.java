import java.util.ArrayList;
import java.util.List;

public class PruebaLibroAudio {
    public static void main(String[] args) {
        List<LibroAudio> libros = new ArrayList<>();

        LibroAudio libro = new LibroAudio();
        libro.setAutor("juan");
        libro.setGenero("accion");
        libro.setPrecio(121313);
        libro.setTitulo("Penelope");
        libro.setDuracion(423);
        libro.setIdioma("español");
        libro.calcularTasaBits("alta");
        libros.add(libro);

        LibroAudio libro1 = new LibroAudio();
        libro1.setAutor("jeca");
        libro1.setGenero("gapa");
        libro1.setPrecio(542243);
        libro1.setTitulo("Penelope");
        libro1.setDuracion(2345);
        libro1.setIdioma("español");
        libro1.calcularTasaBits("baja");
        libros.add(libro1);

        LibroAudio libro2 = new LibroAudio();
        libro2.setAutor("lolo");
        libro2.setGenero("fifa");
        libro2.setPrecio(234235);
        libro2.setTitulo("ñoño");
        libro2.setDuracion(654);
        libro2.setIdioma("french");
        libro2.calcularTasaBits("alta");
        libros.add(libro2);

        LibroAudio libro3 = new LibroAudio();
        libro3.setAutor("pepe");
        libro3.setGenero("tiro");
        libro3.setPrecio(121313);
        libro3.setTitulo("carla");
        libro3.setDuracion(6856);
        libro3.setIdioma("ingles");
        libro3.calcularTasaBits("baja");
        libros.add(libro3);

        for (LibroAudio librito : libros) {
            System.out.println(librito);
        }
    }
}


