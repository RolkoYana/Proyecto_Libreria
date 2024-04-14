import java.util.ArrayList;
import java.util.List;

public class PruebaLibroInfantil {
    public static void main(String[] args) {
        List<LibroInfantil> libro = new ArrayList<>();

        LibroInfantil libroli = new LibroInfantil();
        libroli.setAutor("juan");
        libroli.setGenero("aventura");
        libroli.setPrecio(20);
        libroli.setTitulo("Los cerditos valientes");
        libroli.setEdadRecomendada(8);
        libroli.setIlustraciones(false);
        libro.add(libroli);


        // Pruebas para los métodos específicos de LibroInfantil
//        System.out.println("\nPruebas para el libro infantil:");
//        System.out.println("Edad recomendada: " + libroli.getEdadRecomendada());
//        System.out.println("Tiene ilustraciones: " + libroli.tieneIlustraciones(libroli.ilustraciones));
//        libroli.contarIlustraciones(libroli.numIlustraciones);
//        int edad = 7; // Edad para verificar si es apto para leer el libro
//        libroli.verificarEdadApta(edad);

        for (LibroInfantil librito : libro) {
            System.out.println(librito);
        }
    }
}
